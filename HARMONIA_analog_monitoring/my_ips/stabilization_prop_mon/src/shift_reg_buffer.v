`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04/06/2015 04:27:32 PM
// Design Name: 
// Module Name: shift_reg_buffer
// Project Name: 
// Target Devices: 
// Tool Versions: 
// Description: 
// 
// Dependencies: 
// 
// Revision:
// Revision 0.01 - File Created
// Additional Comments:
// 
//////////////////////////////////////////////////////////////////////////////////


module shift_reg_buffer #(parameter A=2)(
    input clk,
    input rst,
    input input_sig,
    output lsb_out    
    );
    
    (* shreg_extract = "yes" *) reg [A-1:0] shift_reg;
    
    always @(posedge clk) begin
     
      if(rst === 1'b1) begin
        shift_reg <= {(A){1'b0}};      
      end
      else begin
        shift_reg[A-2:0]    <= shift_reg[A-1:1]; 	
        shift_reg[A-1:A-1]  <= input_sig;
      end
    end
    
    assign lsb_out = shift_reg[0:0];
endmodule
