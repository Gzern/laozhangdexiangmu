package matlab.util;

/**
 * matlab和ns2仿真代码.m文件
 */
public interface SimulationName {

    //运行matlab命令
    String MATLAB_COMMAND = "matlab -nodesktop -nosplash -r ";
    //运行图片命令
    String PIC_COMMAND = "display ";
    //运行NS2命令
    String NS2_COMMAND = "ns ";

    //project 1


    String NON_COOPERATIVE_GAME_SPECTRUM_SYSTEM_CAPACITY_CONTRAST_PIC = "/home/slc/matlab_test/sys_capa_2.png";
    String NON_COOPERATIVE_GAME_SPECTRUM_SYSTEM_CAPACITY_CONTRAST = "spectrumbeta_three.m";
    String SPECTRUM_SYSTEM_CAPACITY_CONTRAST_0_PIC = "/home/slc/matlab_test/sc_0_new.png";
    String SPECTRUM_SYSTEM_CAPACITY_CONTRAST_0 = "spectrumbeta_0.m";
    String SPECTRUM_SYSTEM_CAPACITY_CONTRAST_0_5_PIC = "/home/slc/matlab_test/sc_0_5_new.png";
    String SPECTRUM_SYSTEM_CAPACITY_CONTRAST_0_5 = "spectrumbeta_0_5.m";
    String SPECTRUM_SYSTEM_CAPACITY_CONTRAST_1_PIC = "/home/slc/matlab_test/sc_1_new.png";
    String SPECTRUM_SYSTEM_CAPACITY_CONTRAST_1 = "spectrumbeta_1.m";
    String NON_COOPERATIVE_GAME_SPECTRUM_CONNECTION_RATE = "jietonglv.m";
    String NON_COOPERATIVE_GAME_SPECTRUM_CONNECTION_RATE_PIC = "/home/slc/matlab_test/cr_2.png";
    String SPECTRUM_SCENARIO_SEPARATION_PIC = "/home/slc/matlab_test/separation.png";
    String SPECTRUM_SCENARIO_PENETRATION_PIC = "/home/slc/matlab_test/penetration.png";
    String SPECTRUM_SCENARIO_FUSION_PIC = "/home/slc/matlab_test/fusion.png";

    //project 2
    String P2_CAPACITY_0 = "cr_0_rongzai.m";
    String P2_CAPACITY_0_5 = "cr_0_5_rongzai.m";
    String P2_CAPACITY_1 = "cr_1_rongzai.m";

    String P2_CONNECT_0 = "cr_0_jietong.m";
    String P2_CONNECT_0_5 = "cr_0_5_jietong.m";
    String P2_CONNECT_1 = "cr_1_jietong.m";

    //project 3
    String SHOW = "show.m";

    String COMPARE_CONNECTION_RATE_0 = "/home/slc/matlab_test/compare7/c_c0.jpg";
    String COMPARE_CONNECTION_RATE_0_5 = "/home/slc/matlab_test/compare7/c_c1.jpg";
    String COMPARE_CONNECTION_RATE_1 = "/home/slc/matlab_test/compare7/c_c2.jpg";

    String COMPARE_SYSTEM_CAPACITY_0 = "/home/slc/matlab_test/compare7/l_c0.jpg";
    String COMPARE_SYSTEM_CAPACITY_0_5 = "/home/slc/matlab_test/compare7/l_c1.jpg";
    String COMPARE_SYSTEM_CAPACITY_1 = "/home/slc/matlab_test/compare7/l_c2.jpg";


    //project 4

    String HEX_NK_TP_FORMAT = "/home/slc/matlab_test/ns2/%s/%dk=%s/%s%dk=%s.PNG";
    String HEX_NK_NS_FORMAT = "/home/slc/matlab_test/ns2/%s/%dk=%s/%s%dk=%s.tcl";

    String HEX = "Hexagonal_cellular_topology";
    String OCT = "Octagonal_topology";
    String SQU = "Square_Topology";


    //接通率
    String NS2_SYSTEM_CAPACITY_FORMAT = "/home/slc/matlab_test/ns2/test1/1/C%dk=%d/data2.gif";
    //容载量
    String NS2_CONNECTION_RATE_FORMAT = "/home/slc/matlab_test/ns2/test1/1/U%dk=%d/data.gif";

}
