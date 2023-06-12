`timescale 1ns / 1ps

/////////////////////////////////////
//								  ///
//  this is top-level monitoring  ///
//	module						  ///
//								  ///
/////////////////////////////////////


module stabilization_property_mon (
    input clk,
    input rst,    
    input trigger,
	input P,
	output err
    );
    
        reg mainformula;     //just for debugging
        reg _sub1000;
    	    
        wire __submonitor_error_sig0;
    	wire __submonitor_error_sig1;
    	wire __submonitor_error_sig2;
    	    
    	once_A_B_monitor0#(30, 90) __submon_instance0 (
    	.clk(clk),
    	.rst(rst),
    	.XXX(( trigger == 1 ) && ( _sub1000 )),
    	.err(__submonitor_error_sig0)
    	);
    
    	once_0_Tau_monitor0#(30) __submon_instance1 (
    	.clk(clk),
    	.rst(rst),
    	.XXX(!( P )),
    	.err(__submonitor_error_sig1)
    	);
    
    	once_0_Tau_monitor1#(30) __submon_instance2 (
    	.clk(clk),
    	.rst(rst),
    	.XXX(__submonitor_error_sig1),
    	.err(__submonitor_error_sig2)
    	);
    
    
        
      always @(posedge clk) begin
    
        if(rst === 1'b1) begin
          mainformula <=1'b1;
          _sub1000 <=1'b0;
    	 
        end
        else begin
    	
    	mainformula <= ( ! ( !__submonitor_error_sig0 ) ) || ( !__submonitor_error_sig2 )   ;
    	_sub1000 <= ( trigger == 0 ) ;
    	
    
        end
      end
    
      assign err = !(( __submonitor_error_sig0 ) || ( !__submonitor_error_sig2 )   );
        
    endmodule
    
    
    //--------------- generated submonitor0 start ------------- //
    //////////////////////////////////////////////////////////////////////////////////
    // Company: 
    // Engineer: Stefan Jaksic
    // 
    // Create Date: 04/03/2015 11:03:19 AM
    // Design Name: 
    // Module Name: once_a_b_clocks_alg
    // Project Name: 
    // Target Devices: Zedboard with ZYNQ 7020 
    // Tool Versions: 
    // Description: This code implements template code for monitor for "eventually in the past" operator with bounds [a,b]
    //  "CLOCKS" ALGORITHM
    // Dependencies: 
    // 
    // Revision:
    // Revision 0.01 - File Created
    // Additional Comments:
    // 
    //////////////////////////////////////////////////////////////////////////////////
    
    
    module once_A_B_monitor0 #(parameter A=0, B=1) (
       input clk,
       input rst,
       input XXX,
       output err
       );
       
       //////////////////////////////////////////
       //calculate CLK_REG_WIDTH and CLK_REG_NUM
       //__ _CLK_REG_WIDTH_ __ - sirina klok reigstra je log2 (a) .   M = 3
       //__ _CLK_REG_NUM_ __   - broj klok registara je 2*ceil(b)/a   N = 2 * ceil(a/(b-a+1)) = 6   
       
       reg [5 - 1:0] clocks_array [0:4 - 1];   
       
       reg [5 - 1:0] i; //counter and address of clock in clock array
       reg [5 - 1:0] j; //counter and address of clock in clock array
    
       integer m; //loop counter
       integer n; //loop counter
       
       reg reg_ev_out; //output signal - registered
       wire ev_out;
       
       localparam VARIABILITY = B - A;
        
       once_MTLB_monitor#(VARIABILITY) ev_mon (  //include this type in the compilation queue
           .clk(clk),
           .rst(rst),
           .XXX(XXX),
           .err(ev_out)   						//TODO - consider whether we should actually use error signal.
       );
       
       always @(posedge clk) begin
        if (rst == 1'b1) begin
    		
          reg_ev_out <= ev_out; //init reg

    	  for (n = 0; n < 4; n = n+1) begin //init array of clocks
    		clocks_array[n] <= {5{1'b1}} - 2;
    	  end
    	  
    	  j <= 3'b000;
        end
        else begin
            
          reg_ev_out <= ev_out;
               
    	  for (m = 0; m < 4; m = m+1) begin //inc array of clocks
    	    if (m != j) begin
    			 
    		  if (clocks_array[m] != (A - 1))
    			clocks_array[m] <= (clocks_array[m] + 1'b1);		 
    			 
            end                                    
    	  end ///for
    		
    	  if(ev_out != reg_ev_out) begin
    			 
    	    clocks_array[j] <= {5{1'b0}};
    		
    		if (j == (4 - 1'b1)) begin
    		  j <= {5{1'b0}}; //artificial overflow
    		end
    		else begin
    		  j <= j+1; //next clock
    		end                
          end
    	  else begin                                
    		if (clocks_array[j] != (A - 1))  //TODO - replace A-1 with localparam A_MINUS_1
    		  clocks_array[j] <= (clocks_array[j] + 1'b1);
    	  end				 
    	end  
      end
       
      always @(posedge clk) begin
        if (rst == 1'b1) begin
    	  i <= {5{1'b0}}; //pointer init value
        end
        else begin
          if (clocks_array[i] == A-2) begin //stedimo 1 klok
             //ako je parni klok istekao onda daj jedan output
             //ako je neparni klok istekao onda daj drugi output
             if (i == (4 - 1'b1)) //broj klokova ovde
               i <= {5{1'b0}}; //artificial overflow
             else
               i <= i+1; //next clock
               //out_sig <= i[0:0] ^ 1'b1;
          end
        end
      end
       
       
       
    assign err = i[0:0] ^ 1'b1;
       
    
       
       
       
    endmodule
    
    //--------------- generated submonitor0 end --------------- //
    //--------------- generated submonitor1 start ------------- //
    //////////////////////////////////////////////////////////////////////////////////
    // Company:
    // Engineer: Stefan Jaksic
    // 
    // Create Date: 03/30/2015 11:24:01 AM
    // Design Name: 
    // Module Name: once_MTLB_monitor
    // Project Name: 
    // Target Devices: 
    // Tool Versions: 
    // Description: Code template For the monitor for "eventually in the past" operator with 
    // Metric Temporal Logic Bounded past. The bounds are always [0,TAU]
    // 
    // Dependencies: 
    // 
    // Revision:
    // Revision 0.01 - File Created
    // Additional Comments:
    // 
    //////////////////////////////////////////////////////////////////////////////////
    
    module once_0_Tau_monitor0 #(parameter TAU=1)(
        input clk,
        input rst,
        input XXX,
        output err
        );
    
        reg [1:0] state;
        reg [5:0] counter;
        reg u;
            
        always @(posedge clk) begin
      
          if(rst === 1'b1) begin  
            //init block
            counter <= {5{1'b0}};
            state <= 2'b00;
            u <= 1'b0 ;
          end
          else begin
          
          case(state)
            2'b00: begin  //virtual starting state
                if (XXX == 1'b1) begin 
                    state <= 2'b01;
                    u <= 1'b1;
                end
                else begin
                    state <= 2'b11;
                    u <= 1'b0;
                end            
            end
            2'b01: begin
                if ((XXX == 1'b0)) begin
                    state <= 2'b10; 
                    u <= 1'b1; 
                    counter <= counter + 1'b1;              
                end
                else
                    counter <= 16'h0000;                 
            end
            2'b10: begin
                counter <= counter + 1'b1;
                
                if (XXX == 1'b1) begin
                    state <= 2'b01;
                    counter <= 16'h0000;
                    u <= 1'b1;
                end
                else if (counter >= TAU) begin
                    state <= 2'b11;
                    counter <= 16'h0000; //This statement is not mandatory - can be omitted
                    u <= 1'b0;                
                end
            end
            2'b11: begin
                if (XXX == 1'b1) begin
                    state <= 2'b01;
                    counter <= 16'h0000;
                    u <= 1'b1;
                end
            end  
          endcase
        end
        end
        
     	assign err = !u;
        
    endmodule
    
    //--------------- generated submonitor1 end --------------- //
    //--------------- generated submonitor2 start ------------- //
    //////////////////////////////////////////////////////////////////////////////////
    // Company:
    // Engineer: Stefan Jaksic
    // 
    // Create Date: 03/30/2015 11:24:01 AM
    // Design Name: 
    // Module Name: once_MTLB_monitor
    // Project Name: 
    // Target Devices: 
    // Tool Versions: 
    // Description: Code template For the monitor for "eventually in the past" operator with 
    // Metric Temporal Logic Bounded past. The bounds are always [0,TAU]
    // 
    // Dependencies: 
    // 
    // Revision:
    // Revision 0.01 - File Created
    // Additional Comments:
    // 
    //////////////////////////////////////////////////////////////////////////////////
    
    module once_0_Tau_monitor1 #(parameter TAU=1)(
        input clk,
        input rst,
        input XXX,
        output err
        );
    
        reg [1:0] state;
        reg [6:0] counter;
        reg u;
            
        always @(posedge clk) begin
      
          if(rst === 1'b1) begin  
            //init block
            counter <= {6{1'b0}};
            state <= 2'b00;
            u <= 1'b0 ;
          end
          else begin
          
          case(state)
            2'b00: begin  //virtual starting state
                if (XXX == 1'b1) begin 
                    state <= 2'b01;
                    u <= 1'b1;
                end
                else begin
                    state <= 2'b11;
                    u <= 1'b0;
                end            
            end
            2'b01: begin
                if ((XXX == 1'b0)) begin
                    state <= 2'b10; 
                    u <= 1'b1; 
                    counter <= counter + 1'b1;              
                end
                else
                    counter <= 16'h0000;                 
            end
            2'b10: begin
                counter <= counter + 1'b1;
                
                if (XXX == 1'b1) begin
                    state <= 2'b01;
                    counter <= 16'h0000;
                    u <= 1'b1;
                end
                else if (counter >= TAU) begin
                    state <= 2'b11;
                    counter <= 16'h0000; //This statement is not mandatory - can be omitted
                    u <= 1'b0;                
                end
            end
            2'b11: begin
                if (XXX == 1'b1) begin
                    state <= 2'b01;
                    counter <= 16'h0000;
                    u <= 1'b1;
                end
            end  
          endcase
        end
        end
        
     	assign err = !u;
        
    endmodule
    
    //--------------- generated submonitor2 end --------------- //
