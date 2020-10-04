package pkg;

public class BeingBuilt implements OrderActions {

	OrderStateBase osb;



	public BeingBuilt(OrderStateBase losb) {

		this.osb = losb;

	}



	@Override
	public void editOrder(int id) {
		System.out.println("Order is currently being edited");
		}



	@Override
	public void cancelOrder() {
		System.out.println("Order cancelled ");
		osb.setOrderState(osb.getCancelled());
		
	}



	@Override
	public void fulfillOrder() {
		System.out.println("Order must be submitted first, please submit");			
	}



	@Override
	public void submitOrder() {
		System.out.println("Order Being Submitted");
		osb.setOrderState(osb.getSubmitted());
	}


	@Override
	public void copyOrder(int OrderNumber) {		
	System.out.println("Order still being built and can't be copied at this stage");	
	}

}
