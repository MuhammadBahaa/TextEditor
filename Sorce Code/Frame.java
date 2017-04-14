package texteditor;

import com.sun.glass.events.KeyEvent;
import java.awt.Color;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Calendar;
import java.util.Formatter;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Action;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.MutableAttributeSet;
import javax.swing.text.SimpleAttributeSet;
import javax.swing.text.StyleConstants;
import javax.swing.text.StyledDocument;

public class Frame extends javax.swing.JFrame implements SaveAction {
    
    public Frame() {
        super("PMB Text Editor version 1");
        initComponents();
    }
    
    public void saveMassage() /*This method to save textarea to file*/ 
    {
        int dialogButton =  JOptionPane.showConfirmDialog (null, "Do you want to save changes ?","Warning",JOptionPane.YES_NO_OPTION);
        if ( dialogButton == JOptionPane.YES_OPTION) 
        {
            output.format(TextPane.getText());  /*this line to get data from text area and save it in file*/
            output.close();
        }
        
    }
    
    @SuppressWarnings("unchecked")
     /**
     * This method is called from within the constructor to initialize the form , GUI.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu5 = new javax.swing.JMenu();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jDialog1 = new javax.swing.JDialog();
        popupMenu1 = new java.awt.PopupMenu();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenu12 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jPopupMenu3 = new javax.swing.JPopupMenu();
        jPopupMenu4 = new javax.swing.JPopupMenu();
        jPopupMenu5 = new javax.swing.JPopupMenu();
        jPopupMenu6 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuBar5 = new javax.swing.JMenuBar();
        jMenu8 = new javax.swing.JMenu();
        jMenu9 = new javax.swing.JMenu();
        jMenuBar6 = new javax.swing.JMenuBar();
        jMenu10 = new javax.swing.JMenu();
        jMenu11 = new javax.swing.JMenu();
        jMenu13 = new javax.swing.JMenu();
        jMenu14 = new javax.swing.JMenu();
        jRadioButton1 = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TextPane = new javax.swing.JTextPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        File = new javax.swing.JMenu();
        New = new javax.swing.JMenuItem();
        open = new javax.swing.JMenuItem();
        Save = new javax.swing.JMenuItem();
        Exist = new javax.swing.JMenuItem();
        Edit = new javax.swing.JMenu();
        copy = new javax.swing.JMenuItem();
        cut = new javax.swing.JMenuItem();
        paste = new javax.swing.JMenuItem();
        Time = new javax.swing.JMenuItem();
        Format = new javax.swing.JMenu();
        jMenu15 = new javax.swing.JMenu();
        FCourier = new javax.swing.JMenuItem();
        FSansSerif = new javax.swing.JMenuItem();
        fMonospaced = new javax.swing.JMenuItem();
        FontStyle = new javax.swing.JMenu();
        fBold = new javax.swing.JMenuItem();
        fItalic = new javax.swing.JMenuItem();
        fBI = new javax.swing.JMenuItem();
        color = new javax.swing.JMenu();
        ColorFont = new javax.swing.JMenu();
        fBlack = new javax.swing.JRadioButtonMenuItem();
        fwhite = new javax.swing.JRadioButtonMenuItem();
        fRed = new javax.swing.JRadioButtonMenuItem();
        fBlue = new javax.swing.JRadioButtonMenuItem();
        fGreen = new javax.swing.JRadioButtonMenuItem();
        fYellow = new javax.swing.JRadioButtonMenuItem();
        ColorBackground = new javax.swing.JMenu();
        jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        Coding = new javax.swing.JMenu();
        C = new javax.swing.JRadioButtonMenuItem();
        bjava = new javax.swing.JRadioButtonMenuItem();
        php = new javax.swing.JRadioButtonMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jMenu5.setText("File");
        jMenuBar3.add(jMenu5);

        jMenu6.setText("Edit");
        jMenuBar3.add(jMenu6);

        jMenuItem6.setText("jMenuItem6");

        jMenuItem8.setText("jMenuItem8");

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        popupMenu1.setLabel("popupMenu1");

        jMenuItem11.setText("jMenuItem11");

        jMenuItem12.setText("jMenuItem12");

        jMenu12.setText("jMenu12");

        jMenu1.setText("File");
        jMenuBar4.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar4.add(jMenu2);

        jMenuItem1.setText("jMenuItem1");

        jMenu7.setText("jMenu7");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jRadioButtonMenuItem2.setSelected(true);
        jRadioButtonMenuItem2.setText("jRadioButtonMenuItem2");

        jMenuItem5.setText("jMenuItem5");

        jCheckBoxMenuItem1.setSelected(true);
        jCheckBoxMenuItem1.setText("jCheckBoxMenuItem1");

        jMenuItem7.setText("jMenuItem7");

        jMenu8.setText("File");
        jMenuBar5.add(jMenu8);

        jMenu9.setText("Edit");
        jMenuBar5.add(jMenu9);

        jMenu10.setText("File");
        jMenuBar6.add(jMenu10);

        jMenu11.setText("Edit");
        jMenuBar6.add(jMenu11);

        jMenu13.setText("jMenu13");

        jMenu14.setText("jMenu14");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jRadioButton1.setText("jRadioButton1");

        TextPane.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        TextPane.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                TextPaneAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        TextPane.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                TextPaneFocusLost(evt);
            }
        });
        TextPane.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TextPaneMouseClicked(evt);
            }
        });
        TextPane.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextPaneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                TextPaneKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(TextPane);

        jMenuBar1.setToolTipText("");

        File.setText("File");
        File.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                FileStateChanged(evt);
            }
        });
        File.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileActionPerformed(evt);
            }
        });

        New.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, java.awt.event.InputEvent.CTRL_MASK));
        New.setText("New");
        New.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NewActionPerformed(evt);
            }
        });
        File.add(New);

        open.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        open.setText("Open");
        open.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                openComponentAdded(evt);
            }
        });
        open.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                openStateChanged(evt);
            }
        });
        open.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                openComponentShown(evt);
            }
        });
        open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openActionPerformed(evt);
            }
        });
        File.add(open);

        Save.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        Save.setText("Save");
        Save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SaveActionPerformed(evt);
            }
        });
        File.add(Save);

        Exist.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        Exist.setText("Exist");
        Exist.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExistActionPerformed(evt);
            }
        });
        File.add(Exist);

        jMenuBar1.add(File);

        Edit.setText("Edit");
        Edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditActionPerformed(evt);
            }
        });

        copy.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        copy.setText("Copy");
        copy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyActionPerformed(evt);
            }
        });
        Edit.add(copy);

        cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        cut.setText("Cut");
        cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cutActionPerformed(evt);
            }
        });
        Edit.add(cut);

        paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        paste.setText("Paste");
        paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pasteActionPerformed(evt);
            }
        });
        Edit.add(paste);

        Time.setText("Time / Date");
        Time.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TimeActionPerformed(evt);
            }
        });
        Edit.add(Time);

        jMenuBar1.add(Edit);

        Format.setText("Format");

        jMenu15.setText("Font ");

        FCourier.setText("Courier");
        FCourier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FCourierActionPerformed(evt);
            }
        });
        jMenu15.add(FCourier);

        FSansSerif.setText("Sans Serif");
        FSansSerif.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FSansSerifActionPerformed(evt);
            }
        });
        jMenu15.add(FSansSerif);

        fMonospaced.setText("Monospaced");
        fMonospaced.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fMonospacedActionPerformed(evt);
            }
        });
        jMenu15.add(fMonospaced);

        Format.add(jMenu15);

        FontStyle.setText("Font Style");

        fBold.setText("Bold");
        fBold.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBoldActionPerformed(evt);
            }
        });
        FontStyle.add(fBold);

        fItalic.setText("Italic");
        fItalic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fItalicActionPerformed(evt);
            }
        });
        FontStyle.add(fItalic);

        fBI.setText("Bold / Italic");
        fBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBIActionPerformed(evt);
            }
        });
        FontStyle.add(fBI);

        Format.add(FontStyle);

        color.setText("Color");

        ColorFont.setText("Font");
        ColorFont.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ColorFontActionPerformed(evt);
            }
        });

        fBlack.setText("Black");
        fBlack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBlackActionPerformed(evt);
            }
        });
        ColorFont.add(fBlack);

        fwhite.setText("White");
        fwhite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fwhiteActionPerformed(evt);
            }
        });
        ColorFont.add(fwhite);

        fRed.setText("Red");
        fRed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fRedActionPerformed(evt);
            }
        });
        ColorFont.add(fRed);

        fBlue.setText("Blue");
        fBlue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fBlueActionPerformed(evt);
            }
        });
        ColorFont.add(fBlue);

        fGreen.setText("Green");
        fGreen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fGreenActionPerformed(evt);
            }
        });
        ColorFont.add(fGreen);

        fYellow.setText("Yellow");
        fYellow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fYellowActionPerformed(evt);
            }
        });
        ColorFont.add(fYellow);

        color.add(ColorFont);

        ColorBackground.setText("Background");

        jRadioButtonMenuItem3.setText("Black");
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem3ActionPerformed(evt);
            }
        });
        ColorBackground.add(jRadioButtonMenuItem3);

        jRadioButtonMenuItem4.setText("White");
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButtonMenuItem4ActionPerformed(evt);
            }
        });
        ColorBackground.add(jRadioButtonMenuItem4);

        color.add(ColorBackground);

        Format.add(color);

        jMenuBar1.add(Format);

        Coding.setText("Coding");
        Coding.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodingActionPerformed(evt);
            }
        });

        C.setText("C / C++");
        C.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CStateChanged(evt);
            }
        });
        C.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                CInputMethodTextChanged(evt);
            }
        });
        C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CActionPerformed(evt);
            }
        });
        Coding.add(C);

        bjava.setText("Java");
        bjava.setVerifyInputWhenFocusTarget(false);
        bjava.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bjavaActionPerformed(evt);
            }
        });
        Coding.add(bjava);

        php.setText("PHP");
        php.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phpActionPerformed(evt);
            }
        });
        Coding.add(php);

        jMenuBar1.add(Coding);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 436, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void openActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openActionPerformed
    
    String  string = null;
    Scanner input = null ;
    StringBuilder sb = new StringBuilder();
   
    saveMassage();
    
    JFileChooser jFileChooser = new JFileChooser();
    int result= jFileChooser.showOpenDialog(this);
    File file = jFileChooser.getSelectedFile();
    
    if(result == JFileChooser.APPROVE_OPTION)
    {
        try {
            input = new Scanner (file);
        }
        catch (FileNotFoundException ex) {
            Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        while ( input.hasNext())
        {
         string = input.nextLine(); 
         sb.append(string).append("\n");
              
        }
        TextPane.setText(sb.toString());
    } 

    }//GEN-LAST:event_openActionPerformed

    private void SaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SaveActionPerformed
        saveMassage();
    }//GEN-LAST:event_SaveActionPerformed

    private void ExistActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExistActionPerformed
        saveMassage();
        System.exit(2);
    }//GEN-LAST:event_ExistActionPerformed

    private void cutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cutActionPerformed
        Action cutAction = new DefaultEditorKit.CutAction();
        cutAction.putValue(Action.NAME, "Cut");
    }//GEN-LAST:event_cutActionPerformed

    private void pasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pasteActionPerformed
        Action pasteAction = new DefaultEditorKit.PasteAction();
        pasteAction.putValue(Action.NAME, "Paste");
      
    }//GEN-LAST:event_pasteActionPerformed

    private void openStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_openStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_openStateChanged

    private void openComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_openComponentAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_openComponentAdded

    private void NewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NewActionPerformed
        
        try {        
             output = new Formatter ("New File "+counter++ +".txt" );
        } 
        catch (FileNotFoundException e) {
                JOptionPane.showMessageDialog(null, "Error opening or creating file", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        saveMassage();
        TextPane.setText(null); /* this line to clear text area */
      
    }//GEN-LAST:event_NewActionPerformed

    private void FileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FileActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FileActionPerformed

    private void FileStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_FileStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_FileStateChanged

    private void openComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_openComponentShown
        // TODO add your handling code here:
    }//GEN-LAST:event_openComponentShown

    private void TextPaneAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_TextPaneAncestorAdded
 
        try {      
             output = new Formatter ("New File.txt");
            } 
        catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error opening or creating file", "Error", JOptionPane.ERROR_MESSAGE);
        }
        
        TextPane.setSelectionColor(Color.CYAN);  
        font =  new Font("Tahoma", 1, 12);
        
    }//GEN-LAST:event_TextPaneAncestorAdded

    private void copyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyActionPerformed
       Action copyAction = new DefaultEditorKit.CopyAction();
       copyAction.putValue(Action.NAME, "Copy");
    }//GEN-LAST:event_copyActionPerformed

    private void EditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EditActionPerformed

    private void TextPaneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TextPaneMouseClicked
        
    }//GEN-LAST:event_TextPaneMouseClicked

    private void bjavaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bjavaActionPerformed
      
        flagC = 0 ;
        flagJ = 1 ;
        flagP = 0 ;
      
    }//GEN-LAST:event_bjavaActionPerformed

    private void CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CActionPerformed
 
        flagC = 1 ;
        flagJ = 0 ;
        flagP = 0 ;

         
    }//GEN-LAST:event_CActionPerformed

    private void CStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CStateChanged

    }//GEN-LAST:event_CStateChanged

    private void phpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phpActionPerformed

        flagC = 0 ;
        flagJ = 0 ;
        flagP = 1 ;
      
    }//GEN-LAST:event_phpActionPerformed

    private void CInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_CInputMethodTextChanged

    }//GEN-LAST:event_CInputMethodTextChanged

    private void TextPaneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPaneKeyPressed
       
  if ( evt.getKeyCode()== KeyEvent.VK_ENTER || evt.getKeyCode()== KeyEvent.VK_SPACE )
        {  
            
            Scanner input = null ;
            String reserved = null ; 
            String string = TextPane.getText() ;
            String search = string.substring(offset) ;
            StyledDocument doc = (StyledDocument) TextPane.getDocument(); 
            MutableAttributeSet attr = new SimpleAttributeSet(); 
   
            if ( flagC == 1)
            {
             try {
             input = new Scanner (new File("C++.txt"));
             } 
             catch (FileNotFoundException ex) {
             Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
             }
             while ( input.hasNext())
             {
               reserved = input.nextLine();

              if ( search.equals(reserved))     {
                 
                StyleConstants.setForeground(attr, Color.RED); 
                doc.setCharacterAttributes(TextPane.getCaretPosition()-search.length(), search.length(), attr , false);
                break;
                
                 }  
             } 
            }
        
             
            if ( flagJ == 1)
            {
             try {
             input = new Scanner (new File("java.txt"));
             } catch (FileNotFoundException ex) {
             Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
             }
              while ( input.hasNext())
               {
               reserved = input.nextLine(); 
            
               if (  reserved.equals( search))   {
               StyleConstants.setForeground(attr, Color.RED); 
                doc.setCharacterAttributes(TextPane.getCaretPosition()-search.length(), search.length(), attr , false);
                   break;
               } 
            }
            }
            
            if ( flagP == 1)
            {
             try {
             input = new Scanner (new File("php.txt"));
             } catch (FileNotFoundException ex) {
             Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
             }
             while ( input.hasNext())
             {
              reserved = input.nextLine(); 
            
              if (  reserved.equals( search))   {
                StyleConstants.setForeground(attr, Color.RED); 
                doc.setCharacterAttributes(TextPane.getCaretPosition()-search.length(), search.length(), attr , false);
               break;
               } 
              }

            }
             
              offset = string.length()+1;
        
             if(evt.getKeyCode()== KeyEvent.VK_ENTER)offset +=1 ;
            
            }
  
    }//GEN-LAST:event_TextPaneKeyPressed

    private void CodingActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodingActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CodingActionPerformed

    private void fBlackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBlackActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fBlackActionPerformed

    private void fRedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fRedActionPerformed
       TextPane.setForeground(new java.awt.Color(255, 102, 102));        
    }//GEN-LAST:event_fRedActionPerformed

    private void TextPaneFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_TextPaneFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_TextPaneFocusLost

    private void jRadioButtonMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem3ActionPerformed
        TextPane.setBackground(new java.awt.Color(0, 0, 0));
    }//GEN-LAST:event_jRadioButtonMenuItem3ActionPerformed

    private void jRadioButtonMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButtonMenuItem4ActionPerformed
        TextPane.setBackground(new java.awt.Color(255, 255, 255));
    }//GEN-LAST:event_jRadioButtonMenuItem4ActionPerformed

    private void fwhiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fwhiteActionPerformed
        TextPane.setForeground(new java.awt.Color(255, 255 , 255));
    }//GEN-LAST:event_fwhiteActionPerformed

    private void ColorFontActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ColorFontActionPerformed
       TextPane.setForeground(new java.awt.Color(0 , 0 , 0));
    }//GEN-LAST:event_ColorFontActionPerformed

    private void fBlueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBlueActionPerformed
       TextPane.setForeground(new java.awt.Color(0, 0, 255));
    }//GEN-LAST:event_fBlueActionPerformed

    private void fGreenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fGreenActionPerformed
        TextPane.setForeground(new java.awt.Color(0, 153, 0));
    }//GEN-LAST:event_fGreenActionPerformed

    private void fYellowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fYellowActionPerformed
       TextPane.setForeground(new java.awt.Color(255, 255 , 0));
    }//GEN-LAST:event_fYellowActionPerformed

    private void TextPaneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextPaneKeyTyped
        
    }//GEN-LAST:event_TextPaneKeyTyped

    private void TimeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TimeActionPerformed
       
        String months[]={
         "Jan","Feb","Mar","Apr",
         "May","Jun","Jul","Aug",
          "Sep","Oct","Nov","Dec"};
        
        GregorianCalendar gcalendar = new GregorianCalendar();
        String h= String.valueOf(gcalendar.get(Calendar.HOUR));
        String m= String.valueOf(gcalendar.get(Calendar.MINUTE));
        String s= String.valueOf(gcalendar.get(Calendar.SECOND));
        String date= String.valueOf(gcalendar.get(Calendar.DATE));
        String mon= months[gcalendar.get(Calendar.MONTH)];
        String year=String.valueOf(gcalendar.get(Calendar.YEAR));
        String hms="Time"+" - "+h+":"+m+":"+s+" Date"+" - "+date+" "+mon+" "+year;
        int loc = TextPane.getCaretPosition();
         TextPane.replaceSelection(hms);
    }//GEN-LAST:event_TimeActionPerformed

    private void FCourierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FCourierActionPerformed
    
      TextPane.setFont(font = new java.awt.Font("Courier", font.getSize() , 12)); 
          
    }//GEN-LAST:event_FCourierActionPerformed

    private void FSansSerifActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FSansSerifActionPerformed
           TextPane.setFont(font = new java.awt.Font("Sans Serif", font.getSize() , 12)); 
    }//GEN-LAST:event_FSansSerifActionPerformed

    private void fMonospacedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fMonospacedActionPerformed
        TextPane.setFont(font = new java.awt.Font("Monospaced ", font.getSize() , 12));
    }//GEN-LAST:event_fMonospacedActionPerformed

    private void fBoldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBoldActionPerformed
       TextPane.setFont(font = new java.awt.Font(font.getName(), Font.BOLD , 12));
    }//GEN-LAST:event_fBoldActionPerformed

    private void fItalicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fItalicActionPerformed
        TextPane.setFont(font = new java.awt.Font(font.getName(), Font.ITALIC , 12));
    }//GEN-LAST:event_fItalicActionPerformed

    private void fBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fBIActionPerformed
       TextPane.setFont(font = new java.awt.Font(font.getName(), Font.ITALIC |Font.BOLD , 12));
    }//GEN-LAST:event_fBIActionPerformed

    /**
     * @param args the command line arguments
     */
    
    int StartFrom ;
    int PositonOfSpace ;
    int TextAreaLength ;
    int PositionOfSpace ;
    private int counter = 1;
    private int offset ,len ;
    private int flagC , flagJ , flagP ;
    private  Formatter output ;
    private  Font font ;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButtonMenuItem C;
    private javax.swing.JMenu Coding;
    private javax.swing.JMenu ColorBackground;
    private javax.swing.JMenu ColorFont;
    private javax.swing.JMenu Edit;
    private javax.swing.JMenuItem Exist;
    private javax.swing.JMenuItem FCourier;
    private javax.swing.JMenuItem FSansSerif;
    private javax.swing.JMenu File;
    private javax.swing.JMenu FontStyle;
    private javax.swing.JMenu Format;
    private javax.swing.JMenuItem New;
    private javax.swing.JMenuItem Save;
    private javax.swing.JTextPane TextPane;
    private javax.swing.JMenuItem Time;
    private javax.swing.JRadioButtonMenuItem bjava;
    private javax.swing.JMenu color;
    private javax.swing.JMenuItem copy;
    private javax.swing.JMenuItem cut;
    private javax.swing.JMenuItem fBI;
    private javax.swing.JRadioButtonMenuItem fBlack;
    private javax.swing.JRadioButtonMenuItem fBlue;
    private javax.swing.JMenuItem fBold;
    private javax.swing.JRadioButtonMenuItem fGreen;
    private javax.swing.JMenuItem fItalic;
    private javax.swing.JMenuItem fMonospaced;
    private javax.swing.JRadioButtonMenuItem fRed;
    private javax.swing.JRadioButtonMenuItem fYellow;
    private javax.swing.JRadioButtonMenuItem fwhite;
    private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu10;
    private javax.swing.JMenu jMenu11;
    private javax.swing.JMenu jMenu12;
    private javax.swing.JMenu jMenu13;
    private javax.swing.JMenu jMenu14;
    private javax.swing.JMenu jMenu15;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenu jMenu9;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuBar jMenuBar5;
    private javax.swing.JMenuBar jMenuBar6;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JPopupMenu jPopupMenu3;
    private javax.swing.JPopupMenu jPopupMenu4;
    private javax.swing.JPopupMenu jPopupMenu5;
    private javax.swing.JPopupMenu jPopupMenu6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem open;
    private javax.swing.JMenuItem paste;
    private javax.swing.JRadioButtonMenuItem php;
    private java.awt.PopupMenu popupMenu1;
    // End of variables declaration//GEN-END:variables
}
