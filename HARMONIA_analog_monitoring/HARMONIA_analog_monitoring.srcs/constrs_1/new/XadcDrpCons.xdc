set_property IOSTANDARD LVCMOS33 [get_ports vn_in]
set_property PACKAGE_PIN L11 [get_ports vp_in]
set_property IOSTANDARD LVCMOS33 [get_ports vp_in]

set_property IOSTANDARD LVCMOS33 [get_ports err]
set_property PACKAGE_PIN W12 [get_ports err]
#JB1

set_property IOSTANDARD LVCMOS33 [get_ports satisfied]
set_property PACKAGE_PIN AA9 [get_ports satisfied]
#JA4

set_property IOSTANDARD LVCMOS33 [get_ports trigger_out]
set_property PACKAGE_PIN Y10 [get_ports trigger_out]
#JA3

set_property IOSTANDARD LVCMOS33 [get_ports predicate_out]
set_property PACKAGE_PIN V10 [get_ports predicate_out]
#JB3

set_property IOSTANDARD LVCMOS33 [get_ports mon_clk_out]
set_property PACKAGE_PIN AA11 [get_ports mon_clk_out]
#JA2

set_property IOSTANDARD LVCMOS33 [get_ports submon_sig_0]
set_property PACKAGE_PIN W8 [get_ports submon_sig_0]
# JB4

set_property IOSTANDARD LVCMOS33 [get_ports submon_sig_2]
set_property PACKAGE_PIN Y11 [get_ports submon_sig_2]
# JA1


set_property MARK_DEBUG true [get_nets design_1_i/stabilization_property_mon_0/inst/u]

connect_debug_port dbg_hub/clk [get_nets u_ila_0_processing_system7_0_FCLK_CLK0]

create_debug_core u_ila_0 ila
set_property ALL_PROBE_SAME_MU true [get_debug_cores u_ila_0]
set_property ALL_PROBE_SAME_MU_CNT 4 [get_debug_cores u_ila_0]
set_property C_ADV_TRIGGER true [get_debug_cores u_ila_0]
set_property C_DATA_DEPTH 32768 [get_debug_cores u_ila_0]
set_property C_EN_STRG_QUAL true [get_debug_cores u_ila_0]
set_property C_INPUT_PIPE_STAGES 0 [get_debug_cores u_ila_0]
set_property C_TRIGIN_EN false [get_debug_cores u_ila_0]
set_property C_TRIGOUT_EN false [get_debug_cores u_ila_0]
set_property port_width 1 [get_debug_ports u_ila_0/clk]
connect_debug_port u_ila_0/clk [get_nets [list design_1_i/processing_system7_0_FCLK_CLK0]]
set_property port_width 12 [get_debug_ports u_ila_0/probe0]
connect_debug_port u_ila_0/probe0 [get_nets [list {design_1_i/Dout[0]} {design_1_i/Dout[1]} {design_1_i/Dout[2]} {design_1_i/Dout[3]} {design_1_i/Dout[4]} {design_1_i/Dout[5]} {design_1_i/Dout[6]} {design_1_i/Dout[7]} {design_1_i/Dout[8]} {design_1_i/Dout[9]} {design_1_i/Dout[10]} {design_1_i/Dout[11]}]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe1]
connect_debug_port u_ila_0/probe1 [get_nets [list design_1_i/drdy_out]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe2]
connect_debug_port u_ila_0/probe2 [get_nets [list design_1_i/mon_clk_in]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe3]
connect_debug_port u_ila_0/probe3 [get_nets [list design_1_i/mon_err_out]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe4]
connect_debug_port u_ila_0/probe4 [get_nets [list design_1_i/mon_pred_in]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe5]
connect_debug_port u_ila_0/probe5 [get_nets [list design_1_i/mon_rst_in]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe6]
connect_debug_port u_ila_0/probe6 [get_nets [list design_1_i/mon_trig_in]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe7]
connect_debug_port u_ila_0/probe7 [get_nets [list design_1_i/submon_sig_0]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe8]
connect_debug_port u_ila_0/probe8 [get_nets [list design_1_i/submon_sig_2]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe9]
connect_debug_port u_ila_0/probe9 [get_nets [list design_1_i/stabilization_property_mon_0/inst/u]]
create_debug_port u_ila_0 probe
set_property port_width 1 [get_debug_ports u_ila_0/probe10]
connect_debug_port u_ila_0/probe10 [get_nets [list design_1_i/xadc_wiz_0_eoc_out]]
set_property C_CLK_INPUT_FREQ_HZ 300000000 [get_debug_cores dbg_hub]
set_property C_ENABLE_CLK_DIVIDER false [get_debug_cores dbg_hub]
set_property C_USER_SCAN_CHAIN 1 [get_debug_cores dbg_hub]
connect_debug_port dbg_hub/clk [get_nets u_ila_0_0_processing_system7_0_FCLK_CLK0]
