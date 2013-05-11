package primefaces.impl.tree;

import java.util.logging.Logger;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.primefaces.event.NodeCollapseEvent;
import org.primefaces.event.NodeExpandEvent;
import org.primefaces.event.NodeSelectEvent;
import org.primefaces.model.DefaultTreeNode;
import org.primefaces.model.TreeNode;

@ManagedBean
@RequestScoped
public class DocumentsController {

    private static final Logger logger = Logger.getLogger(DocumentsController.class.getName());

    private TreeNode root;
    private TreeNode selectedDocument;

    public DocumentsController() {
        root = new DefaultTreeNode("Root", null);  
        TreeNode node0 = new DefaultTreeNode("Node 0", root);  
        TreeNode node1 = new DefaultTreeNode("Node 1", root);  
        TreeNode node2 = new DefaultTreeNode("Node 2", root);  

        TreeNode node00 = new DefaultTreeNode("Node 0.0", node0);  
        TreeNode node01 = new DefaultTreeNode("Node 0.1", node0);  

        TreeNode node10 = new DefaultTreeNode("Node 1.0", node1);  
        TreeNode node11 = new DefaultTreeNode("Node 1.1", node1);  

        TreeNode node000 = new DefaultTreeNode("Node 0.0.0", node00);  
        TreeNode node001 = new DefaultTreeNode("Node 0.0.1", node00);  
        TreeNode node010 = new DefaultTreeNode("Node 0.1.0", node01);  

        TreeNode node100 = new DefaultTreeNode("Node 1.0.0", node10);  
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public TreeNode getSelectedDocument() {
        return selectedDocument;
    }

    public void setSelectedDocument(TreeNode selectedDocument) {
        this.selectedDocument = selectedDocument;
    }

    public void onNodeSelect(NodeSelectEvent event) {
        selectedDocument = event.getTreeNode();
        logger.info("Selected:" + selectedDocument.getData());
    }

    public void onNodeExpand(NodeExpandEvent event) {
        String node = event.getTreeNode().getData().toString();
        logger.info("Expanded:" + node);
    }

    public void onNodeCollapse(NodeCollapseEvent event) {
        String node = event.getTreeNode().getData().toString();
        logger.info("Collapsed:" + node);
    }
}
