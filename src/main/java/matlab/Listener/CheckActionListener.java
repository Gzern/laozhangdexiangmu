package matlab.Listener;

import matlab.frame.AbstractProjectFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Button事件监听器
 */
public abstract class CheckActionListener implements ActionListener {

    private AbstractProjectFrame jFrame;

    public CheckActionListener(AbstractProjectFrame jFrame) {
        this.jFrame = jFrame;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //事件预处理
        if (!jFrame.checkParams()) {
            return;
        }
        // 创建一个非模态对话框
        final JDialog dialog = new JDialog(jFrame, "仿真运行中...", false);
        // 设置对话框的宽高
        dialog.setSize(150, 80);
        // 设置对话框大小不可改变
        dialog.setResizable(false);
        // 设置对话框相对显示的位置
        dialog.setLocationRelativeTo(null);
        // 创建一个标签显示消息内容
        JLabel messageLabel = new JLabel("仿真运行中...");
        // 创建对话框的内容面板, 在面板内可以根据自己的需要添加任何组件并做任意是布局
        JPanel panel = new JPanel();
        // 添加组件到面板
        panel.add(messageLabel);
        // 设置对话框的内容面板
        dialog.setContentPane(panel);
        // 显示对话框
        dialog.setVisible(true);
        //执行具体事件
        performed();
        //取消显示对话框
        dialog.setVisible(false);
    }

    /**
     * 具体执行事件
     */
    protected abstract void performed();

}
