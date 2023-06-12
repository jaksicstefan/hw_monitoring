//Copyright 1986-2014 Xilinx, Inc. All Rights Reserved.
//--------------------------------------------------------------------------------
//Tool Version: Vivado v.2014.4 (win64) Build 1071353 Tue Nov 18 18:29:27 MST 2014
//Date        : Wed Aug 19 21:51:32 2015
//Host        : N3SAS1408 running 64-bit Service Pack 1  (build 7601)
//Command     : generate_target design_1.bd
//Design      : design_1
//Purpose     : IP block netlist
//--------------------------------------------------------------------------------
`timescale 1 ps / 1 ps

module design_1
   (DDR_addr,
    DDR_ba,
    DDR_cas_n,
    DDR_ck_n,
    DDR_ck_p,
    DDR_cke,
    DDR_cs_n,
    DDR_dm,
    DDR_dq,
    DDR_dqs_n,
    DDR_dqs_p,
    DDR_odt,
    DDR_ras_n,
    DDR_reset_n,
    DDR_we_n,
    FIXED_IO_ddr_vrn,
    FIXED_IO_ddr_vrp,
    FIXED_IO_mio,
    FIXED_IO_ps_clk,
    FIXED_IO_ps_porb,
    FIXED_IO_ps_srstb,
    err,
    mon_clk_out,
    predicate_out,
    satisfied,
    submon_sig_0,
    submon_sig_2,
    trigger_out,
    vn_in,
    vp_in);
  inout [14:0]DDR_addr;
  inout [2:0]DDR_ba;
  inout DDR_cas_n;
  inout DDR_ck_n;
  inout DDR_ck_p;
  inout DDR_cke;
  inout DDR_cs_n;
  inout [3:0]DDR_dm;
  inout [31:0]DDR_dq;
  inout [3:0]DDR_dqs_n;
  inout [3:0]DDR_dqs_p;
  inout DDR_odt;
  inout DDR_ras_n;
  inout DDR_reset_n;
  inout DDR_we_n;
  inout FIXED_IO_ddr_vrn;
  inout FIXED_IO_ddr_vrp;
  inout [53:0]FIXED_IO_mio;
  inout FIXED_IO_ps_clk;
  inout FIXED_IO_ps_porb;
  inout FIXED_IO_ps_srstb;
  output err;
  output mon_clk_out;
  output predicate_out;
  output satisfied;
  output submon_sig_0;
  output submon_sig_2;
  output trigger_out;
  input vn_in;
  input vp_in;

(* MARK_DEBUG *)   wire [11:0]Dout;
  wire GND_1;
(* MARK_DEBUG *)   wire drdy_out;
(* MARK_DEBUG *)   wire mon_clk_in;
(* MARK_DEBUG *)   wire mon_err_out;
(* MARK_DEBUG *)   wire mon_pred_in;
(* MARK_DEBUG *)   wire mon_rst_in;
  wire mon_sat_out;
(* MARK_DEBUG *)   wire mon_trig_in;
  wire new_gNot_0_not_a;
  wire pred_block_0_predicatized_out;
  wire [14:0]processing_system7_0_DDR_ADDR;
  wire [2:0]processing_system7_0_DDR_BA;
  wire processing_system7_0_DDR_CAS_N;
  wire processing_system7_0_DDR_CKE;
  wire processing_system7_0_DDR_CK_N;
  wire processing_system7_0_DDR_CK_P;
  wire processing_system7_0_DDR_CS_N;
  wire [3:0]processing_system7_0_DDR_DM;
  wire [31:0]processing_system7_0_DDR_DQ;
  wire [3:0]processing_system7_0_DDR_DQS_N;
  wire [3:0]processing_system7_0_DDR_DQS_P;
  wire processing_system7_0_DDR_ODT;
  wire processing_system7_0_DDR_RAS_N;
  wire processing_system7_0_DDR_RESET_N;
  wire processing_system7_0_DDR_WE_N;
  wire processing_system7_0_FCLK_CLK0;
  wire processing_system7_0_FCLK_RESET0_N;
  wire processing_system7_0_FIXED_IO_DDR_VRN;
  wire processing_system7_0_FIXED_IO_DDR_VRP;
  wire [53:0]processing_system7_0_FIXED_IO_MIO;
  wire processing_system7_0_FIXED_IO_PS_CLK;
  wire processing_system7_0_FIXED_IO_PS_PORB;
  wire processing_system7_0_FIXED_IO_PS_SRSTB;
(* MARK_DEBUG *)   wire submon_sig_0;
(* MARK_DEBUG *)   wire submon_sig_2;
  wire vn_in_1;
  wire vp_in_1;
  wire [4:0]xadc_wiz_0_channel_out;
  wire [15:0]xadc_wiz_0_do_out;
(* MARK_DEBUG *)   wire xadc_wiz_0_eoc_out;
  wire [6:0]xlconcat_0_dout;
  wire [1:0]xlconstant_0_dout;

  assign err = mon_err_out;
  assign mon_clk_out = mon_clk_in;
  assign predicate_out = mon_pred_in;
  assign satisfied = mon_sat_out;
  assign trigger_out = mon_trig_in;
  assign vn_in_1 = vn_in;
  assign vp_in_1 = vp_in;
GND GND
       (.G(GND_1));
design_1_clk_divider_0_2 clk_divider_0
       (.clk_in(processing_system7_0_FCLK_CLK0),
        .clk_out_fast(mon_clk_in),
        .clk_out_slow(mon_trig_in),
        .reset_n(processing_system7_0_FCLK_RESET0_N));
design_1_new_gNot_0_0 new_gNot_0
       (.a(processing_system7_0_FCLK_RESET0_N),
        .not_a(new_gNot_0_not_a));
design_1_new_gNot_0_1 new_gNot_1
       (.a(pred_block_0_predicatized_out),
        .not_a(mon_pred_in));
design_1_new_gNot_2_0 new_gNot_2
       (.a(processing_system7_0_FCLK_RESET0_N),
        .not_a(mon_rst_in));
design_1_pred_block_0_0 pred_block_0
       (.data_in(Dout),
        .data_ready(drdy_out),
        .predicatized_out(pred_block_0_predicatized_out));
design_1_processing_system7_0_0 processing_system7_0
       (.DDR_Addr(DDR_addr[14:0]),
        .DDR_BankAddr(DDR_ba[2:0]),
        .DDR_CAS_n(DDR_cas_n),
        .DDR_CKE(DDR_cke),
        .DDR_CS_n(DDR_cs_n),
        .DDR_Clk(DDR_ck_p),
        .DDR_Clk_n(DDR_ck_n),
        .DDR_DM(DDR_dm[3:0]),
        .DDR_DQ(DDR_dq[31:0]),
        .DDR_DQS(DDR_dqs_p[3:0]),
        .DDR_DQS_n(DDR_dqs_n[3:0]),
        .DDR_DRSTB(DDR_reset_n),
        .DDR_ODT(DDR_odt),
        .DDR_RAS_n(DDR_ras_n),
        .DDR_VRN(FIXED_IO_ddr_vrn),
        .DDR_VRP(FIXED_IO_ddr_vrp),
        .DDR_WEB(DDR_we_n),
        .FCLK_CLK0(processing_system7_0_FCLK_CLK0),
        .FCLK_RESET0_N(processing_system7_0_FCLK_RESET0_N),
        .MIO(FIXED_IO_mio[53:0]),
        .M_AXI_GP0_ACLK(processing_system7_0_FCLK_CLK0),
        .M_AXI_GP0_ARREADY(GND_1),
        .M_AXI_GP0_AWREADY(GND_1),
        .M_AXI_GP0_BID({GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1}),
        .M_AXI_GP0_BRESP({GND_1,GND_1}),
        .M_AXI_GP0_BVALID(GND_1),
        .M_AXI_GP0_RDATA({GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1}),
        .M_AXI_GP0_RID({GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1}),
        .M_AXI_GP0_RLAST(GND_1),
        .M_AXI_GP0_RRESP({GND_1,GND_1}),
        .M_AXI_GP0_RVALID(GND_1),
        .M_AXI_GP0_WREADY(GND_1),
        .PS_CLK(FIXED_IO_ps_clk),
        .PS_PORB(FIXED_IO_ps_porb),
        .PS_SRSTB(FIXED_IO_ps_srstb));
design_1_stabilization_property_mon_0_2 stabilization_property_mon_0
       (.P(mon_pred_in),
        .clk(mon_clk_in),
        .err(mon_err_out),
        .rst(mon_rst_in),
        .satisfied(mon_sat_out),
        .submon_sig_0(submon_sig_0),
        .submon_sig_2(submon_sig_2),
        .trigger(mon_trig_in));
design_1_xadc_wiz_0_0 xadc_wiz_0
       (.channel_out(xadc_wiz_0_channel_out),
        .daddr_in(xlconcat_0_dout),
        .dclk_in(processing_system7_0_FCLK_CLK0),
        .den_in(xadc_wiz_0_eoc_out),
        .di_in({GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1,GND_1}),
        .do_out(xadc_wiz_0_do_out),
        .drdy_out(drdy_out),
        .dwe_in(GND_1),
        .eoc_out(xadc_wiz_0_eoc_out),
        .reset_in(new_gNot_0_not_a),
        .vn_in(vn_in_1),
        .vp_in(vp_in_1));
design_1_xlconcat_0_0 xlconcat_0
       (.In0(xadc_wiz_0_channel_out),
        .In1(xlconstant_0_dout),
        .dout(xlconcat_0_dout));
design_1_xlconstant_0_0 xlconstant_0
       (.dout(xlconstant_0_dout));
design_1_xlslice_0_0 xlslice_0
       (.Din(xadc_wiz_0_do_out),
        .Dout(Dout));
endmodule
