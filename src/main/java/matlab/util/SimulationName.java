package matlab.util;

/**
 * matlab仿真代码.m文件
 */
public interface SimulationName {

    //运行matlab命令
    String MATLAB_COMMAND = "matlab -nodesktop -nosplash -r ";
    //运行图片命令
    String PIC_COMMAND = "eog ";
    //运行NS2命令
    String NS2_COMMAND = "ns ";

    //王超
    String NON_COOPERATIVE_GAME_SPECTRUM_ALLOCATE = "spectrum.m";

    String NON_COOPERATIVE_GAME_SPECTRUM_RU_PROFIT = "spectrum_ru_Profit.m";

    String NON_COOPERATIVE_GAME_SPECTRUM_PU_PROFIT = "spectrum_pu_Profit.m";

    String NON_COOPERATIVE_GAME_SPECTRUM_SYSTEM_CAPACITY = "spectrumbeta.m";

    String NON_COOPERATIVE_GAME_SPECTRUM_SYSTEM_CAPACITY_PIC = "game_system_capacity.jpg";

    String NON_COOPERATIVE_GAME_SPECTRUM_CONNECTION_RATE_PIC = "game_connection_rate.jpg";

    String NON_COOPERATIVE_GAME_SPECTRUM_SCENARIO_PIC = "xxxx.png";

    //胡光耀仿真
    String HU_GUANG_YAO_1 = "channel.m";

    String HU_GUANG_YAO_2 = "power_allocation.m";

    String HU_GUANG_YAO_3 = "resource.m";

    //李颜良
    String SHOW = "show.m";

    //单路超

    //网络拓扑模型
    String NS2_NETWORK_TOPOLOGY_MODEL_1_PIC = "/home/slc/matlab_test/ns2/NetworkTopologyModel/1.jpg";
    String NS2_NETWORK_TOPOLOGY_MODEL_2_PIC = "/home/slc/matlab_test/ns2/NetworkTopologyModel/2.jpg";
    String NS2_NETWORK_TOPOLOGY_MODEL_3_PIC = "/home/slc/matlab_test/ns2/NetworkTopologyModel/3.jpg";

    //ns2仿真程序
    String NS2_NETWORK_COMMUNICATION_SIMULATION_1_TCL = "/home/slc/matlab_test/ns2/NetworkCommunicationSimulation/1.tcl";
    String NS2_NETWORK_COMMUNICATION_SIMULATION_2_TCL = "/home/slc/matlab_test/ns2/NetworkCommunicationSimulation/2.tcl";
    String NS2_NETWORK_COMMUNICATION_SIMULATION_3_TCL = "/home/slc/matlab_test/ns2/NetworkCommunicationSimulation/3.tcl";

    //生成结果数据
    String NS2_GENEATE_RESULT_DATA_1_POLT = "/home/slc/matlab_test/ns2/GenerateResultData/data1/data.plot";
    String NS2_GENEATE_RESULT_DATA_2_POLT = "/home/slc/matlab_test/ns2/GenerateResultData/data2/data.plot";

    //接通率
    String NS2_SYSTEM_CAPACITY_PIC = "/home/slc/matlab_test/ns2/GenerateResultData/data1/data.gif";
    //容载量
    String NS2_CONNECTION_RATE_PIC = "/home/slc/matlab_test/ns2/GenerateResultData/data2/data2.gif";

}
