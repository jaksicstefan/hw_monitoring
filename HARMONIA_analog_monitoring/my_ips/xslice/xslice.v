`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04/25/2015 10:41:51 PM
// Design Name: 
// Module Name: xslice
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


module xslice(
    input [15:0] DIN,
    output [11:0] DOUT
    );
    
    always @(DIN) begin
        DOUT = DIN[15:4];
    end
endmodule
