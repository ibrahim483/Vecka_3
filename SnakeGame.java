import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SnakeGame {
    private static final int BOARD_WIDTH = 40;
    private static final int BOARD_HEIGHT = 40;
    private static final int DOT_SIZE = 10;
    private static final int SPEED = 50; // milliseconds between moves

    private JFrame frame;
    private Board board;
    private Snake snake;
    private Timer timer;

    public SnakeGame() {
        board = new Board(BOARD_WIDTH, BOARD_HEIGHT);
        snake = new Snake();
        frame = new JFrame("Snake Game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(board);
        frame.pack();
        frame.setVisible(true);

        // Handle keyboard input
        frame.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                snake.setDirection(e.getKeyCode());
            }
        });

        // Game loop
        ActionListener gameLoop = e -> {
            snake.move();
            board.repaint();
        };

        timer = new Timer(SPEED, gameLoop);
        timer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new SnakeGame();
        });
    }
}