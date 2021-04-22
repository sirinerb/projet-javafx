/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pharmacie.javafx;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javax.activation.DataSource;

/**
 * FXML Controller class
 *
 * @author User
 */
public class AvisController implements Initializable {

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
  /*public class AvisController {

    @FXML
    private TableView<avis> table;

    @FXML
    private TableColumn<avis,String> nom_usercolumn;

    @FXML
    private TableColumn<avis, String> nom_phcolumn;

    @FXML
    private TableColumn<avis, String> contenucolumn;  
    
    
    
    
    private final Connection cnx;
    private static AvisController instance;
    
    public AvisController() {
        cnx = DataSource.getInstance().getCnx();
    }
    
    public static AvisController getInstance()
    {
        if (instance == null) {
            instance = new AvisController();
        }
        return instance; 
    }
    
    
    
        public boolean AjouterFeedBack (avis f){
        
        int verf = 0 ;
        try{
        String req ;
        
        req="INSERT INTO `avis`(`nom_user`,`Nom_ph`,`Contenu`) VALUES (?,?,?)";
        PreparedStatement res=cnx.prepareStatement(req);
        
        res.setString(1, f.getNom_user());
        res.setString(2, f.getNom_ph());
        res.setString(3, f.getContenu());
    
        verf=res.executeUpdate();
         
        
        }
        catch(SQLException e ){
        Logger.getLogger(AvisController.class.getName()).log(Level.SEVERE,null,e);
        
        }
        if (verf==0)
        {return false;}
        else {return true;}
    }
        
        
        
          
   public List<avis> getFeedBackByUser(int id ){
        
        List<avis> list = new ArrayList<avis>();
        int count =0;
        
        String requete="select * from avis where idUser="+id;
         try{
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(requete);
            
            while (rs.next()){
                
                avis u = new avis();
                u.setId(rs.getInt(1));
                u.setNom_user(rs.getString(2));
                u.setContenu(rs.getString(4));
                u.setNom_ph(rs.getString(3));
                list.add(u);
                count++;
            }
            if(count == 0){
                return null;
           }else{
               return list;
        }
         }
        catch (SQLException ex) {
            Logger.getLogger(AvisController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   
           
}
   
    public List<avis> getFeedBack(){
        
        List<avis> list = new ArrayList<avis>();
        int count =0;
        
        String requete="select * from avis ";
         try{
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(requete);
            
            while (rs.next()){
                
                avis u = new avis();
                u.setId(rs.getInt(1));
                u.setNom_user(rs.getString(2));
                u.setContenu(rs.getString(4));
                u.setNom_ph(rs.getString(3));
                count++;
            }
            if(count == 0){
                return null;
           }else{
               return list;
        }
         }
        catch (SQLException ex) {
            Logger.getLogger(AvisController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   
           
}
   
   
    public boolean deleteFeddBack(int id)  {
        try {
            
            Statement st=cnx.createStatement();
            String req= "DELETE FROM `feedback` WHERE `id` ="+id;
            st.executeUpdate(req);
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(AvisController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }

    }
  
    
     public avis findFeedBackById(int id)
    {
        avis u = new avis();
        int count = 0;
           
        String requete="select * from avis where id="+id;
        try{
            Statement st = cnx.createStatement();
            ResultSet rs = st.executeQuery(requete);
            while(rs.next())
            {  
                u.setId(rs.getInt(1));
                u.setNom_user(rs.getString(2));
                u.setContenu(rs.getString(4));
                u.setNom_ph(rs.getString(3));
              

                count++;
            }
           if(count == 0){
                return null;
           }else{
               return u;
           }  
        }
        catch (SQLException ex) {
            Logger.getLogger(AvisController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
   }
     
     
}

public void showAvis(){
    ObservableList<avis> list = getAvisList();
    nom_usercolumn.setCellValueFactory(new PropertyValueFactory<Pharmacies, String>("nom_user"));
    nom_phcolumn.setCellValueFactory(new PropertyValueFactory<Pharmacies, String>("Nom_ph"));
    contenucolumn.setCellValueFactory(new PropertyValueFactory<Pharmacies, String>("Contenu"));
    table.setItems(list);
}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        showAvis(); //To change body of generated methods, choose Tools | Templates.
    }
    

   */
}
