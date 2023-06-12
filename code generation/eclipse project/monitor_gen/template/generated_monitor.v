`timescale 1ns / 1ps

/////////////////////////////////////
//								  ///
//  this is top-level monitoring  ///
//	module						  ///
//								  ///
/////////////////////////////////////


module auto_generated_monitor0 (
    input clk,
    input rst,    
    input alwaysq,
	output err
    );

    reg mainformula;     //just for debugging
        
        

    
  always @(posedge clk) begin

    if(rst === 1'b1) begin
      mainformula <=1'b1;
      
    end
    else begin
	
	mainformula <= alwaysq   ;
	

    end
  end

  assign err = !(alwaysq   );
    
endmodule


