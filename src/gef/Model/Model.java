//--------------------------------------------------------------------------------------
//���� ��翡 ���� �����͸� �����Ѵ�.
//�� ���������� root, node, connection ���� �ִ�.
//root ���� �ٸ� ��� ���� �����ϴ� �ֻ��� ���̴�
//some node models, connections�� �����Ѵ�.
//--------------------------------------------------------------------------------------
package gef.Model;
import java.util.ArrayList;
import java.util.List;

public class Model {
	private List<NodeModel> nodes;
 
	public Model() {
 
		nodes = new ArrayList<NodeModel>();
 
		for (int i = 0; i < 3; i++) {
			NodeModel node = new NodeModel("Node " + i );
			nodes.add(node);
		}
 
		//set the connection here
		for (int i = 0; i < 2; i++) {
			NodeConnectionModel connection = new NodeConnectionModel();
 
			connection.setSource((NodeModel) nodes.get(i));
			connection.setTarget((NodeModel) nodes.get(i +1));
 
			((NodeModel) nodes.get(i)).addSourceConnection(connection);
			((NodeModel) nodes.get(i +1)).addTargetConnection(connection);
		}
 
	}
 
	public List<NodeModel> getNodes() {
		return nodes;
	}
}