package handler;

import com.github.sarxos.webcam.Webcam;

import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class MainForm {
    public static void main(String[] args) throws IOException {
        getPermission();
    }

    private static void getPermission() throws IOException {
        System.out.print("Do you want to Open camera ?  ");
        Scanner scanner = new Scanner(System.in);
        String select = scanner.next();

        if (select.equals("y")){
            openCamera();
        }
    }

    private static void openCamera() throws IOException {
        Webcam webcam = Webcam.getDefault();
        webcam.open();
        ImageIO.write(webcam.getImage(), "jpg", new File("firstCapture.jpg"));
    }

}
