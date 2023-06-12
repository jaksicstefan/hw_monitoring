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

module ____ONCE_0_TAU_MONITOR_NAME____ #(parameter TAU=1)(
    input clk,
    input rst,
    input XXX,
    output err
    );

    reg [1:0] state;
    reg [____ONCE_0_TAU_CNTR_MSB____:0] counter;
    reg u;
        
    always @(posedge clk) begin
  
      if(rst === 1'b1) begin  
        //init block
        counter <= {____ONCE_0_TAU_CNTR_MSB____{1'b0}};
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
