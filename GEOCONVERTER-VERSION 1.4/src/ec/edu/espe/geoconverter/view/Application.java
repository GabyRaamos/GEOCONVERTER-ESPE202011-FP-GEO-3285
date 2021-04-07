package ec.edu.espe.geoconverter.view;

/**
 *
 * @author
 */
public class Application {
    public static void main(String[] args) {
        FrmMainForm view = new FrmMainForm();
        view.setVisible(true);
        view.revalidate();
        view.setContainerView(new FrmTransformationOfUnitsOfLength());
        
    }
}
