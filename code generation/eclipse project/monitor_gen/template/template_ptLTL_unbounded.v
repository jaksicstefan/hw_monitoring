`timescale 1ns / 1ps

module ____MONITOR_NAME____ (
    input clk,
    input rst,    
    ____INPUT_LIST_INSERT____    
    output err
    );

    reg mainformula;
    
    ____INSERT_SUB_DECLARATIONS____
    
    ____INSERT_SUBMODULES_INSTANTIATIONS____
    
  always @(posedge clk) begin

    if(rst === 1'b1) begin  

      ____INIT_SUBS____
      
    end
    else begin
	
	mainformula <= ____INSERT_MAIN_FORMULA____
	
	____INSERT_GEN_FORMULAS____

    end
  end

  assign err = !mainformula;
    
endmodule
