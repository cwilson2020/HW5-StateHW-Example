package pkg;

public class Test_main {

	
	static OrderStateBase state;
	/*public Test_main() {
		
	}
	*/
	

	public static void main(String[] args) {
		state = new OrderStateBase();
				state.editOrder(1);
	// test scenarios	
		state.submitOrder();
		
		state.copyOrder(1);
		
		state.cancelOrder();
		
		state.submitOrder();
		state.cancelOrder();
		state.editOrder(1);
		state.fulfillOrder();
		state.cancelOrder();
		state.fulfillOrder();
		
		

	}

}
