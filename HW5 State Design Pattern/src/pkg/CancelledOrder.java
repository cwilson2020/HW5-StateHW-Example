package pkg;

public class CancelledOrder implements OrderActions {

	OrderStateBase osb;
	
	
	
	public CancelledOrder(OrderStateBase losb) {
		
		this.osb = losb;
	}

	

	@Override
	public void cancelOrder() {
		// TODO Auto-generated method stub
		System.out.println("Order has already been cancelled");
	}


	@Override
	public void fulfillOrder() {
		// TODO Auto-generated method stub
			System.out.println("A canceled order can not be fulfilled");
			
	}



	@Override
	public void submitOrder() {
				System.out.println("Order has been canceled therefore can not be submitted.");
		
	}



	@Override
	public void editOrder(int OrderNumber) {
		System.out.println("Order can't be edited as because it was cancelled");
		osb.setOrderState(osb.getBeingBuilt());
		
	}



	@Override
	public void copyOrder(int OrderNumber) {
		// TODO Auto-generated method stub
		System.out.println("Recalling CANCELLED Order number and copying it. " +String.valueOf(OrderNumber));
		osb.setOrderState(osb.getBeingBuilt());
	}

}
