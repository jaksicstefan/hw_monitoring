`timescale 1ns / 1ps

module auto_generated_monitor0 (
    input clk,
    input rst,    
    input XXX,
    
    output err
    );

    reg mainformula;
    
    
    
  always @(posedge clk) begin

    if(rst === 1'b1) begin  

      
      
    end
    else begin
	
	mainformula <= eventually [ 0 : 4 ] XXX ; 
	
	

    end
  end

  assign err = !mainformula;
    
endmodule
