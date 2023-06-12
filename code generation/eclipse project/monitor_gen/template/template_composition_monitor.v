`timescale 1ns / 1ps

/////////////////////////////////////
//								  ///
//  this is top-level monitoring  ///
//	module						  ///
//								  ///
/////////////////////////////////////


module ____MONITOR_NAME____ (
    input clk,
    input rst,    
    ____INPUT_LIST_INSERT____	output err
    );

    reg mainformula;     //just for debugging
    ____INSERT_SUB_DECLARATIONS____    
    ____INSERT_SUBMONITORS_ERR_SIGS_DECLARATIONS____    
____INSERT_SUBMONITORS_INSTANTIATIONS____
    
  always @(posedge clk) begin

    if(rst === 1'b1) begin
      mainformula <=1'b1;
      ____INIT_SUBS____
    end
    else begin
	
	mainformula <= ____INSERT_MAIN_FORMULA____;
	____INSERT_GEN_FORMULAS____

    end
  end

  assign err = !(____INSERT_MAIN_FORMULA____);
    
endmodule


____INSERT_GEN_SUBMONITORS_DEFINITIONS____