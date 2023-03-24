package Controladores;

import Modelos.Lista;
import Vistas.frmNodos;
import Vistas.frmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class NodoController implements ActionListener {

    //LEVANTAR FORMULARIO PRINCIPAL
    
    frmPrincipal VistaPrincipal;
    frmNodos VistaNodos;
    Lista nuevaLista;

    public NodoController(frmPrincipal VistaPrincipal, frmNodos VistaNodos, Lista nuevaLista) {
        this.VistaPrincipal = VistaPrincipal;
        this.VistaNodos = VistaNodos;
        this.nuevaLista = nuevaLista;
        
        //PONER A LA ESCUCHA LOS BOTONES
        
        this.VistaPrincipal.bttnAgregarNodo.addActionListener(this);
        
        //LEVANTAR VISTA PRINCIPAL
        
        this.VistaPrincipal.setExtendedState(frmPrincipal.MAXIMIZED_BOTH);
        this.VistaPrincipal.setVisible(true);
        
        
    }
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()== this.VistaPrincipal.bttnAgregarNodo) {
            
            //ABRIR LA VISTA NODOS
            
          //PONER A LA ESCUCHA LOS BOTONES QUE SE TIENEN EN LA VISTA NODOS
          
          this.VistaNodos.bttnApilar.addActionListener(this);
          this.VistaNodos.bttnEncolar.addActionListener(this);
          
          //LEVANTAR EL FORMULARIO VISTA NODOS
          
         this.VistaNodos.setLocationRelativeTo(null);
         this.VistaNodos.setVisible(true);
          
        }
        
        if(e.getSource()==this.VistaNodos.bttnApilar) {
            
            this.nuevaLista.Apilar(Integer.parseInt(this.VistaNodos.txtDato.getText()));
            this.VistaNodos.txtLista.setText(this.nuevaLista.Listar());
        }
    }
    
}
