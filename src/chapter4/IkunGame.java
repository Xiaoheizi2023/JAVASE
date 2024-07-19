package chapter4;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class IkunGame extends JFrame {
    private final JTextField textField;

    public IkunGame() {
        setTitle("小黑子的游戏");
        setSize(400, 200);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setIconImage(); // 调用设置图标的方法

        JPanel panel = new JPanel(new FlowLayout());

        JLabel label = new JLabel("请输入您的练习时长（例如：1年）:");
        textField = new JTextField(20);
        JButton button = new JButton("确认");

        button.addActionListener(this::handleButtonClick);

        panel.add(label);
        panel.add(textField);
        panel.add(button);

        add(panel);
    }

    private void setIconImage()
    {
        ImageIcon imageIcon=new ImageIcon("C:/Users/Lx166/Pictures/image.ico");
        setIconImage(imageIcon.getImage());
    }

//    private void setIconImage() {
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        Image image = toolkit.getImage("C:/Users/Lx166/IdeaProjects/JAVASE/src/chapter4/image.ico");
//        setIconImage(image);
//    }

//    private void setIconImage() {
//        Toolkit toolkit = Toolkit.getDefaultToolkit();
//        // 使用相对路径
//        Image image = toolkit.getImage("image.ico");
//
//        // 检查图片是否成功加载
//        MediaTracker tracker = new MediaTracker(this);
//        tracker.addImage(image, 0);
//        try {
//            tracker.waitForID(0);
//            if (!tracker.isErrorAny()) {
//                setIconImage(image);
//            } else {
//                System.err.println("图标加载失败");
//                JOptionPane.showMessageDialog(this, "图标加载失败", "错误", JOptionPane.ERROR_MESSAGE);
//            }
//        } catch (InterruptedException e) {
//            System.err.println("图标加载中断");
//            JOptionPane.showMessageDialog(this, "图标加载中断", "错误", JOptionPane.ERROR_MESSAGE);
//        }
//    }

    private void handleButtonClick(ActionEvent e) {
        String input = textField.getText();
        double duration = parsePracticeDuration(input);

        String message;
        if (duration < 2.5) {
            message = "经验不够的小黑子不给，蒸虾头";
        } else if (duration == 2.5) {
            message = "全服公告：你干嘛哎嗨嗨哟";
        } else {
            message = String.format("您是练习时长%.1f年真正的ikun，请表演唱跳rap篮球", duration);
        }

        JOptionPane.showMessageDialog(this, message, "提示", JOptionPane.INFORMATION_MESSAGE);
    }

    private double parsePracticeDuration(String input) {
        NumberFormat format = NumberFormat.getNumberInstance(Locale.CHINA);
        try {
            Number number = format.parse(input.replaceAll("[^\\d.]", ""));
            return number.doubleValue();
        } catch (ParseException e) {
            JOptionPane.showMessageDialog(this, "请输入有效的练习时长", "输入错误", JOptionPane.ERROR_MESSAGE);
            return 0;
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new IkunGame().setVisible(true));
    }
}
