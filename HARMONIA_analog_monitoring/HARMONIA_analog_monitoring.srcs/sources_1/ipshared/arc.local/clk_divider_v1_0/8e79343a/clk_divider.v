`timescale 1ns / 1ps
//////////////////////////////////////////////////////////////////////////////////
// Company: 
// Engineer: 
// 
// Create Date: 04/28/2015 05:20:42 PM
// Design Name: 
// Module Name: clk_divider
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


module clk_divider(
    input reset_n,
    input clk_in,
    output clk_out_fast,
    output clk_out_slow
    );
    
    reg fast_clk;
    reg slow_clk;
    reg [31:0] counter1;
    reg [15:0] counter2;
    
    always @(posedge clk_in) begin
      if (reset_n == 1'b0) begin
        fast_clk <= 1'b0;
        slow_clk <= 1'b0;
        counter1 <= 32'h00000000;
        counter2 <= 16'h0000;
      end
      else begin
        //if (counter1 == 16'd999) begin
        if (counter1 == 32'd599999) begin
             slow_clk <= ~slow_clk;
            counter1 <= 32'h00000000;
        end
        else 
            counter1 <= counter1 + 1;
            
        if (counter2 == 16'd124) begin
            counter2 <= 16'h0000;
            fast_clk <= ~fast_clk;
            end
        else 
            counter2 <= counter2 + 1;
        end
    end
    
//    always @(posedge clk_in) begin
//        if ((counter1 == 1000))  slow_clk <= ~slow_clk;
//        if ((counter2 == 1000))  fast_clk <= ~fast_clk;
//    end
    
    assign clk_out_fast = fast_clk;    
    assign clk_out_slow = slow_clk;


endmodule
