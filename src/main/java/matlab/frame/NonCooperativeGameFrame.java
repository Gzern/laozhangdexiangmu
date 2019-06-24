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
        JButton button1 = new JButton("多认知系统链路分离场景");
        JButton button2 = new JButton("链路分离容载量对比");
        JButton button3 = new JButton("多认知系统链路渗透场景");
        JButton button4 = new JButton("链路渗透容载量对比");
        JButton button5 = new JButton("多认知系统链路融合场景");
        JButton button6 = new JButton("链路融合容载量对比");
        JButton button7 = new JButton("系统容载量");
        JButton button8 = new JButton("用户接入率");

        button1.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.separationPic();
            }
        });
        button2.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.spectrumSystemCapacity0(null);
            }
        });
        button3.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.penetrationPic();
            }
        });
        button4.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                //系统容载量
                nonCooperativeGame.spectrumSystemCapacity0_5(null);
            }
        });
        button5.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.fusionPic();
            }
        });
        button6.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.spectrumSystemCapacity1(null);
            }
        });
        button7.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.spectrumSystemCapacity(null);
            }
        });
        button8.addActionListener(new CheckActionListener(this) {
            @Override
            protected void performed() {
                nonCooperativeGame.spectrumConnectionRate(null);
            }
        });


        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        contentPane.add(button6);
        contentPane.add(button7);
        contentPane.add(button8);


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

        springLayout.putConstraint(SpringLayout.NORTH, button6, 270, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button6, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button7, 310, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button7, -50, SpringLayout.EAST, contentPane);

        springLayout.putConstraint(SpringLayout.NORTH, button8, 350, SpringLayout.NORTH, contentPane);
        springLayout.putConstraint(SpringLayout.EAST, button8, -50, SpringLayout.EAST, contentPane);

    }

}
