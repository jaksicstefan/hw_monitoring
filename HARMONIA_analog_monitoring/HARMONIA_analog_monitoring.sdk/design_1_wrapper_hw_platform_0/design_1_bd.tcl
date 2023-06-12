
################################################################
# This is a generated script based on design: design_1
#
# Though there are limitations about the generated script,
# the main purpose of this utility is to make learning
# IP Integrator Tcl commands easier.
################################################################

################################################################
# Check if script is running in correct Vivado version.
################################################################
set scripts_vivado_version 2014.4
set current_vivado_version [version -short]

if { [string first $scripts_vivado_version $current_vivado_version] == -1 } {
   puts ""
   puts "ERROR: This script was generated using Vivado <$scripts_vivado_version> and is being run in <$current_vivado_version> of Vivado. Please run the script in Vivado <$scripts_vivado_version> then open the design in Vivado <$current_vivado_version>. Upgrade the design by running \"Tools => Report => Report IP Status...\", then run write_bd_tcl to create an updated script."

   return 1
}

################################################################
# START
################################################################

# To test this script, run the following commands from Vivado Tcl console:
# source design_1_script.tcl

# If you do not already have a project created,
# you can create a project using the following command:
#    create_project project_1 myproj -part xc7z020clg484-1
#    set_property BOARD_PART em.avnet.com:zed:part0:1.2 [current_project]


# CHANGE DESIGN NAME HERE
set design_name design_1

# If you do not already have an existing IP Integrator design open,
# you can create a design using the following command:
#    create_bd_design $design_name

# CHECKING IF PROJECT EXISTS
if { [get_projects -quiet] eq "" } {
   puts "ERROR: Please open or create a project!"
   return 1
}


# Creating design if needed
set errMsg ""
set nRet 0

set cur_design [current_bd_design -quiet]
set list_cells [get_bd_cells -quiet]

if { ${design_name} eq "" } {
   # USE CASES:
   #    1) Design_name not set

   set errMsg "ERROR: Please set the variable <design_name> to a non-empty value."
   set nRet 1

} elseif { ${cur_design} ne "" && ${list_cells} eq "" } {
   # USE CASES:
   #    2): Current design opened AND is empty AND names same.
   #    3): Current design opened AND is empty AND names diff; design_name NOT in project.
   #    4): Current design opened AND is empty AND names diff; design_name exists in project.

   if { $cur_design ne $design_name } {
      puts "INFO: Changing value of <design_name> from <$design_name> to <$cur_design> since current design is empty."
      set design_name [get_property NAME $cur_design]
   }
   puts "INFO: Constructing design in IPI design <$cur_design>..."

} elseif { ${cur_design} ne "" && $list_cells ne "" && $cur_design eq $design_name } {
   # USE CASES:
   #    5) Current design opened AND has components AND same names.

   set errMsg "ERROR: Design <$design_name> already exists in your project, please set the variable <design_name> to another value."
   set nRet 1
} elseif { [get_files -quiet ${design_name}.bd] ne "" } {
   # USE CASES: 
   #    6) Current opened design, has components, but diff names, design_name exists in project.
   #    7) No opened design, design_name exists in project.

   set errMsg "ERROR: Design <$design_name> already exists in your project, please set the variable <design_name> to another value."
   set nRet 2

} else {
   # USE CASES:
   #    8) No opened design, design_name not in project.
   #    9) Current opened design, has components, but diff names, design_name not in project.

   puts "INFO: Currently there is no design <$design_name> in project, so creating one..."

   create_bd_design $design_name

   puts "INFO: Making design <$design_name> as current_bd_design."
   current_bd_design $design_name

}

puts "INFO: Currently the variable <design_name> is equal to \"$design_name\"."

if { $nRet != 0 } {
   puts $errMsg
   return $nRet
}

##################################################################
# DESIGN PROCs
##################################################################



# Procedure to create entire design; Provide argument to make
# procedure reusable. If parentCell is "", will use root.
proc create_root_design { parentCell } {

  if { $parentCell eq "" } {
     set parentCell [get_bd_cells /]
  }

  # Get object for parentCell
  set parentObj [get_bd_cells $parentCell]
  if { $parentObj == "" } {
     puts "ERROR: Unable to find parent cell <$parentCell>!"
     return
  }

  # Make sure parentObj is hier blk
  set parentType [get_property TYPE $parentObj]
  if { $parentType ne "hier" } {
     puts "ERROR: Parent <$parentObj> has TYPE = <$parentType>. Expected to be <hier>."
     return
  }

  # Save current instance; Restore later
  set oldCurInst [current_bd_instance .]

  # Set parent object as current
  current_bd_instance $parentObj


  # Create interface ports
  set DDR [ create_bd_intf_port -mode Master -vlnv xilinx.com:interface:ddrx_rtl:1.0 DDR ]
  set FIXED_IO [ create_bd_intf_port -mode Master -vlnv xilinx.com:display_processing_system7:fixedio_rtl:1.0 FIXED_IO ]

  # Create ports
  set err [ create_bd_port -dir O err ]
  set mon_clk_out [ create_bd_port -dir O mon_clk_out ]
  set predicate_out [ create_bd_port -dir O predicate_out ]
  set satisfied [ create_bd_port -dir O satisfied ]
  set submon_sig_0 [ create_bd_port -dir O submon_sig_0 ]
  set submon_sig_2 [ create_bd_port -dir O submon_sig_2 ]
  set trigger_out [ create_bd_port -dir O trigger_out ]
  set vn_in [ create_bd_port -dir I vn_in ]
  set vp_in [ create_bd_port -dir I vp_in ]

  # Create instance: clk_divider_0, and set properties
  set clk_divider_0 [ create_bd_cell -type ip -vlnv arc.local:user:clk_divider:1.0 clk_divider_0 ]

  # Create instance: new_gNot_0, and set properties
  set new_gNot_0 [ create_bd_cell -type ip -vlnv arc.local:user:new_gNot:1.0 new_gNot_0 ]

  # Create instance: new_gNot_1, and set properties
  set new_gNot_1 [ create_bd_cell -type ip -vlnv arc.local:user:new_gNot:1.0 new_gNot_1 ]

  # Create instance: new_gNot_2, and set properties
  set new_gNot_2 [ create_bd_cell -type ip -vlnv arc.local:user:new_gNot:1.0 new_gNot_2 ]

  # Create instance: pred_block_0, and set properties
  set pred_block_0 [ create_bd_cell -type ip -vlnv arc.local:user:pred_block:1.0 pred_block_0 ]
  set_property -dict [ list CONFIG.THRESHOLD {2048}  ] $pred_block_0

  # Create instance: processing_system7_0, and set properties
  set processing_system7_0 [ create_bd_cell -type ip -vlnv xilinx.com:ip:processing_system7:5.5 processing_system7_0 ]

  # Create instance: stabilization_property_mon_0, and set properties
  set stabilization_property_mon_0 [ create_bd_cell -type ip -vlnv arc.local:user:stabilization_property_mon:1.0 stabilization_property_mon_0 ]
  set_property -dict [ list CONFIG.DIV_TIME {200} CONFIG.STAB_TIME {100}  ] $stabilization_property_mon_0

  # Create instance: xadc_wiz_0, and set properties
  set xadc_wiz_0 [ create_bd_cell -type ip -vlnv xilinx.com:ip:xadc_wiz:3.0 xadc_wiz_0 ]
  set_property -dict [ list CONFIG.ACQUISITION_TIME {4} CONFIG.ENABLE_CALIBRATION_AVERAGING {false} CONFIG.ENABLE_RESET {true} CONFIG.ENABLE_VCCDDRO_ALARM {false} CONFIG.ENABLE_VCCPAUX_ALARM {false} CONFIG.ENABLE_VCCPINT_ALARM {false} CONFIG.INTERFACE_SELECTION {ENABLE_DRP} CONFIG.OT_ALARM {false} CONFIG.SIM_FILE_SEL {Default} CONFIG.SINGLE_CHANNEL_SELECTION {VP_VN} CONFIG.TIMING_MODE {Continuous} CONFIG.USER_TEMP_ALARM {false} CONFIG.VCCAUX_ALARM {false} CONFIG.VCCINT_ALARM {false} CONFIG.WAVEFORM_TYPE {SQUARE}  ] $xadc_wiz_0

  # Create instance: xlconcat_0, and set properties
  set xlconcat_0 [ create_bd_cell -type ip -vlnv xilinx.com:ip:xlconcat:2.1 xlconcat_0 ]
  set_property -dict [ list CONFIG.IN0_WIDTH {5} CONFIG.IN1_WIDTH {2}  ] $xlconcat_0

  # Create instance: xlconstant_0, and set properties
  set xlconstant_0 [ create_bd_cell -type ip -vlnv xilinx.com:ip:xlconstant:1.1 xlconstant_0 ]
  set_property -dict [ list CONFIG.CONST_VAL {00} CONFIG.CONST_WIDTH {2}  ] $xlconstant_0

  # Create instance: xlslice_0, and set properties
  set xlslice_0 [ create_bd_cell -type ip -vlnv xilinx.com:ip:xlslice:1.0 xlslice_0 ]
  set_property -dict [ list CONFIG.DIN_FROM {15} CONFIG.DIN_TO {4} CONFIG.DIN_WIDTH {16}  ] $xlslice_0

  # Create interface connections
  connect_bd_intf_net -intf_net processing_system7_0_DDR [get_bd_intf_ports DDR] [get_bd_intf_pins processing_system7_0/DDR]
  connect_bd_intf_net -intf_net processing_system7_0_FIXED_IO [get_bd_intf_ports FIXED_IO] [get_bd_intf_pins processing_system7_0/FIXED_IO]

  # Create port connections
  connect_bd_net -net Dout [get_bd_pins pred_block_0/data_in] [get_bd_pins xlslice_0/Dout]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets Dout]
  connect_bd_net -net drdy_out [get_bd_pins pred_block_0/data_ready] [get_bd_pins xadc_wiz_0/drdy_out]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets drdy_out]
  connect_bd_net -net mon_clk_in [get_bd_ports mon_clk_out] [get_bd_pins clk_divider_0/clk_out_fast] [get_bd_pins stabilization_property_mon_0/clk]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets mon_clk_in]
  connect_bd_net -net mon_err_out [get_bd_ports err] [get_bd_pins stabilization_property_mon_0/err]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets mon_err_out]
  connect_bd_net -net mon_pred_in [get_bd_ports predicate_out] [get_bd_pins new_gNot_1/not_a] [get_bd_pins stabilization_property_mon_0/P]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets mon_pred_in]
  connect_bd_net -net mon_rst_in [get_bd_pins new_gNot_2/not_a] [get_bd_pins stabilization_property_mon_0/rst]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets mon_rst_in]
  connect_bd_net -net mon_sat_out [get_bd_ports satisfied] [get_bd_pins stabilization_property_mon_0/satisfied]
  connect_bd_net -net mon_trig_in [get_bd_ports trigger_out] [get_bd_pins clk_divider_0/clk_out_slow] [get_bd_pins stabilization_property_mon_0/trigger]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets mon_trig_in]
  connect_bd_net -net new_gNot_0_not_a [get_bd_pins new_gNot_0/not_a] [get_bd_pins xadc_wiz_0/reset_in]
  connect_bd_net -net pred_block_0_predicatized_out [get_bd_pins new_gNot_1/a] [get_bd_pins pred_block_0/predicatized_out]
  connect_bd_net -net processing_system7_0_FCLK_CLK0 [get_bd_pins clk_divider_0/clk_in] [get_bd_pins processing_system7_0/FCLK_CLK0] [get_bd_pins processing_system7_0/M_AXI_GP0_ACLK] [get_bd_pins xadc_wiz_0/dclk_in]
  connect_bd_net -net processing_system7_0_FCLK_RESET0_N [get_bd_pins clk_divider_0/reset_n] [get_bd_pins new_gNot_0/a] [get_bd_pins new_gNot_2/a] [get_bd_pins processing_system7_0/FCLK_RESET0_N]
  connect_bd_net -net submon_sig_0 [get_bd_ports submon_sig_0] [get_bd_pins stabilization_property_mon_0/submon_sig_0]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets submon_sig_0]
  connect_bd_net -net submon_sig_2 [get_bd_ports submon_sig_2] [get_bd_pins stabilization_property_mon_0/submon_sig_2]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets submon_sig_2]
  connect_bd_net -net vn_in_1 [get_bd_ports vn_in] [get_bd_pins xadc_wiz_0/vn_in]
  connect_bd_net -net vp_in_1 [get_bd_ports vp_in] [get_bd_pins xadc_wiz_0/vp_in]
  connect_bd_net -net xadc_wiz_0_channel_out [get_bd_pins xadc_wiz_0/channel_out] [get_bd_pins xlconcat_0/In0]
  connect_bd_net -net xadc_wiz_0_do_out [get_bd_pins xadc_wiz_0/do_out] [get_bd_pins xlslice_0/Din]
  connect_bd_net -net xadc_wiz_0_eoc_out [get_bd_pins xadc_wiz_0/den_in] [get_bd_pins xadc_wiz_0/eoc_out]
  set_property -dict [ list HDL_ATTRIBUTE.MARK_DEBUG {true}  ] [get_bd_nets xadc_wiz_0_eoc_out]
  connect_bd_net -net xlconcat_0_dout [get_bd_pins xadc_wiz_0/daddr_in] [get_bd_pins xlconcat_0/dout]
  connect_bd_net -net xlconstant_0_dout [get_bd_pins xlconcat_0/In1] [get_bd_pins xlconstant_0/dout]

  # Create address segments
  

  # Restore current instance
  current_bd_instance $oldCurInst

  save_bd_design
}
# End of create_root_design()


##################################################################
# MAIN FLOW
##################################################################

create_root_design ""


