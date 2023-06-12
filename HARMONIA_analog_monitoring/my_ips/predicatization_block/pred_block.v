`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04/28/2015 02:23:03 PM
// Design Name: 
// Module Name: pred_block
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

//THRESHOLD BETWEEN 0~4096
//DUE TO ADC CHARACTERISTICS
module pred_block #(parameter THRESHOLD = 1)(
    input data_ready,
    input [11:0] data_in,
    output predicatized_out
    );
    
    assign predicatized_out = (data_in >= THRESHOLD);
    
endmodule
