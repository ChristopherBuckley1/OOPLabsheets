package Lab12.exercise1;

//BorderLayoutWindowEvent.java
/*This program shows how the BorderLayout layout manager and window-events
operate*/

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

    public class BorderLayoutWindowEvent extends JFrame {
        private String userText="";
        private JButton jb[];
        private JTextArea textArea = new JTextArea("");

        public BorderLayoutWindowEvent() {
            super("Demonstrating BorderLayout & WindowEvent");

            BorderLayout layout = new BorderLayout(6, 8);
            setLayout(layout);

            String regions[] = {BorderLayout.NORTH, BorderLayout.SOUTH, BorderLayout.EAST,
                    BorderLayout.WEST, BorderLayout.CENTER};

            /*jb = new JButton[regions.length];

            for (int i = 0; i < regions.length; i++) {
                jb[i] = new JButton(regions[i]);
                add(jb[i],regions[i]);
            }*/
           JLabel jl = new JLabel("Please enter your text on the text-area below");

           jl.setOpaque(true);
           add(jl,regions[0]);


           Font font = new Font("monospaced",Font.PLAIN,11);
           textArea.setForeground(Color.blue);
            textArea.setEditable(true);
            textArea.setLineWrap(true);
            add(textArea,regions[4]);





            addWindowListener(new WindowEventHandler());
            setSize(400, 300);

            setVisible(true);

        }


        public static void main(String args[]) {
            BorderLayoutWindowEvent b = new BorderLayoutWindowEvent();
        }

        private class WindowEventHandler implements WindowListener {

            public void windowOpened(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window now opened", "Opening Window",
                        JOptionPane.INFORMATION_MESSAGE);
            }

            //hides the window on closing by default (so application is still actually running in background)
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Now closing window", "Closing Window",
                        JOptionPane.INFORMATION_MESSAGE);
                int choice = JOptionPane.showConfirmDialog(null, "Are you sure you want to exit this application?", "Exiting Application Confirmation",
                        JOptionPane.YES_NO_CANCEL_OPTION);

                if(choice==JOptionPane.YES_OPTION)
                    dispose();
            }

            //method only called when dispose() is called on the relevant window from elsewhere
            public void windowClosed(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Closed (Disposed)", "Window Closed (Disposed)",
                        JOptionPane.INFORMATION_MESSAGE);

            }


            public void windowIconified(WindowEvent e) {

                JOptionPane.showMessageDialog(null, "Window Minimised", "Window Minimised",
                        JOptionPane.INFORMATION_MESSAGE);
                int totalChars=0,vowels=0,spaces=0,digits=0,letters=0,sentences=0,endingWithD=0;
                int random = (int)(Math.random()*5);
                System.out.println(textArea.getText());
                for(int i=0;i<textArea.getText().length();i++)
                {
                    totalChars++;
                    if (textArea.getText().toLowerCase().charAt(i)=='a'||textArea.getText().toLowerCase().charAt(i)=='e'||textArea.getText().toLowerCase().charAt(i)=='i'||textArea.getText().toLowerCase().charAt(i)=='o'||textArea.getText().toLowerCase().charAt(i)=='u')
                    {
                        vowels++;
                    }
                    if(textArea.getText().charAt(i)==' ')
                        spaces++;
                    if(Character.isDigit(textArea.getText().charAt(i)))
                        digits++;
                    if(Character.isAlphabetic(textArea.getText().charAt(i)))
                    {
                        letters++;
                    }
                    if(textArea.getText().charAt(i)=='.')
                        sentences++;


                       if(textArea.getText().charAt(i)=='d'&&!Character.isAlphabetic(textArea.getText().charAt(i+1)))
                        {
                            endingWithD++;
                        }



                }
                System.out.println(spaces);


                JOptionPane.showMessageDialog(null,"Total number of characters: "+totalChars+"\n"
                                                                        +"Total number of vowels: "+vowels+"\n"+
                                                                        "Total number of letters: "+letters+"\n"+
                                                                        "Total number of digits: "+digits+"\n"+
                                                                        "Total number of words: "+(spaces+1)+"\n"+
                                                                        "Total number of sentences: "+sentences+"\n"+
                                                                        "Total number of words ending with 'd': "+(endingWithD-1)+"\n"
                                                                        , "Data",JOptionPane.INFORMATION_MESSAGE);


            }


            public void windowDeiconified(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "Window Unminimised", "Window Unminimised",
                        JOptionPane.INFORMATION_MESSAGE);
            }


            public void windowActivated(WindowEvent e) {
                 //better to use console here to prevent logical error
                System.out.println("Window Activated");
            }


            public void windowDeactivated(WindowEvent e) {
                //better to use console here to prevent logical error
                System.out.println(userText);
                System.out.println("Window Deactivated");
            }
        }
    }
