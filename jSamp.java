package jSamp;
import javax.swing.JOptionPane;
public class jSamp {
	
	 private Object[] options = {"Confirm dialog", "Option dialog"};
	    private Object result;
	    public jSamp() {
	        result = JOptionPane.showInputDialog(null, "Choose window dialog...", "DIALOG",
	                JOptionPane.INFORMATION_MESSAGE, null, options, 0);
	        if (result == null)
	            JOptionPane.showMessageDialog(null, "No choose..",
	                    "Errore", JOptionPane.ERROR_MESSAGE);
	        else if (result == "Confirm dialog")
	            showConfirm();
	        else if (result == "Option dialog")
	            showOption();
	    }
	    private void showConfirm() {
	        int n = JOptionPane.showConfirmDialog(null, "Procede with insert?", "Advice",
	                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.WARNING_MESSAGE);
	        showAnswer(n);
	    }
	    private void showOption() {
	        Object[] labels = {"Go ahead..", "OPS, don't do it..", "AUTO RESET"};
	        int n = JOptionPane.showOptionDialog(null, "Reboot System?", "????",
	                JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,
	                null, labels, labels[1]);
	        showAnswer(n);
	    }
	    private void showAnswer(int n) {
	        if (n == JOptionPane.YES_OPTION)
	            JOptionPane.showMessageDialog(null, "choose button YES");
	        else if (n == JOptionPane.NO_OPTION)
	            JOptionPane.showMessageDialog(null, "choose button NO");
	        else if (n == JOptionPane.CANCEL_OPTION)
	            JOptionPane.showMessageDialog(null, "choose button CANCEL");
	        else if (n == JOptionPane.CLOSED_OPTION)
	            JOptionPane.showMessageDialog(null, "Dialog window closed");
	    }
	      public static void main(String args[]) {
	    	  jSamp dialogs = new jSamp();
	    }
	}


