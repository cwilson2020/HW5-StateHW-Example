package pkg;

public class FulfilledOrder implements OrderActions {

	OrderStateBase osb;



	public FulfilledOrder(OrderStateBase losb) {

		this.osb = losb;

	}



	@Override
	public void editOrder(int id) {
		System.out.println("Order has been fulfilled, no changes can be made");
		}



	@Override
	public void cancelOrder() {
		System.out.println("Order has been fulfilled and can not be cancelled.");
	
		
	}



	@Override
	public void fulfillOrder() {
		System.out.println("Order already fulfilled");			
	}



	@Override
	public void submitOrder() {
		System.out.println("Order Already Submitted and fulfilled");
	}



	@Override
	public void copyOrder(int OrderNumber) {
		// TODO Auto-generated method stub
	System.out.println("Copying Order and opening new Order");
		osb.setOrderState(osb.getBeingBuilt());		
	}

}
