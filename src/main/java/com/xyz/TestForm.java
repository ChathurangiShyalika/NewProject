package com.xyz;

import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.MojoExecutionException;
import org.apache.maven.plugin.MojoFailureException;
import org.apache.maven.plugins.annotations.Mojo;

import javax.swing.*;

/**
 * Created by chathurangi on 7/20/17.
 */
@Mojo( name = "gui")
public class TestForm extends AbstractMojo {
    private JButton button1;
    private JPanel panel1;


    public static void main(String[] args){


    }

    public void execute() throws MojoExecutionException {


        JFrame frame = new JFrame("TestForm");
        frame.getContentPane();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.pack();
        frame.setVisible(true);



    }
}
