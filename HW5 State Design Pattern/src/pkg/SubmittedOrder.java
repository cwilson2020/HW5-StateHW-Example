package pkg;

public class SubmittedOrder implements OrderActions {

	OrderStateBase osb;



	public SubmittedOrder(OrderStateBase losb) {

		this.osb = losb;

	}





	@Override
	public void editOrder(int id) {
		System.out.println("Unsubmitting the order for editing");
		osb.setOrderState(osb.getBeingBuilt());	
		osb.setOrderID(id);

	}



	@Override
	public void cancelOrder() {
		System.out.println("Order moving from submitted state to cancelled");
		osb.setOrderState(osb.getCancelled());		
	}



	@Override
	public void fulfillOrder() {
		System.out.println("Order Fulfilled");
		osb.setOrderState(osb.getFulfilled());		
	}



	@Override
	public void submitOrder() {
		System.out.println("Order Already Submitted");
	}



	@Override
	public void copyOrder(int OrderNumber) {
		// TODO Auto-generated method stub
	System.out.println("Copying Order and opening the newly made order");
		osb.setOrderState(osb.getBeingBuilt());		
	}

}
