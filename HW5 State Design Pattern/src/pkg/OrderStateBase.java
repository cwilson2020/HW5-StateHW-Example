package pkg;

public class OrderStateBase {



	private boolean orderExists = false;
	private int OrderID;
	private OrderActions fulfilled;
	private OrderActions canceled;
	private OrderActions submitted;
	private OrderActions beingBuilt;


	private OrderActions orderState;

	public OrderStateBase() {
		canceled = new CancelledOrder(this);
		submitted = new SubmittedOrder(this);
		fulfilled = new FulfilledOrder(this);
		beingBuilt = new BeingBuilt(this);
		OrderID = 0; // let '0' mean invalid / new order
		orderState = beingBuilt;
	}

	void setOrderState (OrderActions state) {
		orderState =state;
	}
	
	void setOrderID(int Id) {
		OrderID =Id;
	}

	public void editOrder(int orderNum){
		orderState.editOrder(orderNum);
	}

	public void cancelOrder() {
		orderState.cancelOrder();
	}

	public void copyOrder(int ordernum) {
		orderState.copyOrder(ordernum);
	}
	public void fulfillOrder() {
		orderState.fulfillOrder();
	}
	
	public void submitOrder() {
		orderState.submitOrder();
	}


	// Get methods
	public OrderActions getFulfilled() {
		return fulfilled;
	}

	public OrderActions getCancelled() {
		return canceled;
	}

	public OrderActions getSubmitted() {
		return submitted;
	}

	public OrderActions getBeingBuilt() {
		return beingBuilt;
	}
	
		
	public int getOrderID() {
	return this.OrderID;
	}
}





