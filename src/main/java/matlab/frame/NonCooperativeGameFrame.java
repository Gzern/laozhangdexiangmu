package matlab.frame;

import matlab.Listener.CheckActionListener;
import matlab.project.NonCooperativeGame;
import matlab.util.Constant;
import org.springframework.stereotype.Component;

import javax.swing.*;
import java.awt.*;

@Component
public class NonCooperativeGameFrame extends AbstractProjectFrame {


    /**
     * 对于每个项目 布局不同的按钮
     */
    public void initLayout() {
        this.setTitle(Constant.NON_COOPERATIVE_GAME_FRAME);

        Container contentPane = this.getContentPane();
        SpringLayout springLayout = (SpringLayout) contentPane.getLayout();
        final NonCooperativeGame nonCooperativeGame = NonCooperativeGame.getInstance();

        /**
         * 添加相应项目功能
         */
        JButton button1 = new JButton("认知系统频谱分配");
        JButton button2 = new JButton("认知系统收益");
        JButton button3 = new JButton("认知节点收益");
        JButton button4 = new JButton("系统容载量");
        JButton button5 = new JButton("接通率");
//        JButton button6 = new JButton("仿真场景说明");

        button1.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.spectrumAllocate(getParamsJSONObject());
            }
        });
        button2.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.spectrumRuProfit(getParamsJSONObject());
            }
        });
        button3.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.spectrumPuProfit(getParamsJSONObject());
            }
        });
        button4.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                //系统容载量
                nonCooperativeGame.spectrumSystemCapacity(null);
            }
        });
        button5.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                //系统接通率
                nonCooperativeGame.spectrumConnectionRate(null);
            }
        });
//        button6.addActionListener(new CheckActionListener(this) {
//            @Override
//            protected void performed() {
//                //仿真场景
//                nonCooperativeGame.spectrumScenarioPic();
//            }
//        });


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
//        contentPane.add(button6);


        /**
         * 添加相应项目的布局
         */
        springLayout.putConstraint(SpringLayout.NORTH, button1, 70, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button1, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button2, 110, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button2, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button3, 150, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button3, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button4, 190, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button4, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button5, 230, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button5, -50, SpringLayout.EAST, contentPane);

//        springLayout.putConstraint(SpringLayout.NORTH, button6, 270, SpringLayout.NORTH, contentPane);
//        springLayout.putConstraint(SpringLayout.EAST, button6, -50, SpringLayout.EAST, contentPane);

    }

}
