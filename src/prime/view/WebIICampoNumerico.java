package prime.view;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JTextField;

public class WebIICampoNumerico extends JTextField implements KeyListener {

	private static final long serialVersionUID = 4836475116403047969L;

	public WebIICampoNumerico() {
		
		addKeyListener( this );
	}
	
	public void setValor(int valor) {
		setText( Integer.toString( valor ) );
	}
	
	/*
	public int getValor() {
		return Integer.parseInt( getText() );
	}
	*/
	///////////////////////////////////////////////////////////////
	public int getValor(){
		try {
			Integer.parseInt( getText() );
		} catch (Exception e){
			return 0;
		}
		return Integer.parseInt( getText() );
	}
	
	//////////////////////////////////////////////////////////
	
	public boolean estaVazio() {
		return getText().trim().length() == 0;
	}


	public void keyPressed(KeyEvent e) {}
	public void keyReleased(KeyEvent e) {}

	public void keyTyped(KeyEvent e) {

		char ch = e.getKeyChar();
		
		if( ch < '0' || ch > '9' ) {
			e.consume();
		}
	}

	 
	
}