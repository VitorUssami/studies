// Stub class generated by rmic, do not edit.
// Contents subject to change without notice.

package proxy.rmi.gumball;

public final class GumballMachine_Stub
    extends java.rmi.server.RemoteStub
    implements proxy.rmi.gumball.GumballMachineRemote, java.rmi.Remote
{
    private static final long serialVersionUID = 2;
    
    private static java.lang.reflect.Method $method_getCount_0;
    private static java.lang.reflect.Method $method_getLocation_1;
    private static java.lang.reflect.Method $method_getState_2;
    
    static {
	try {
	    $method_getCount_0 = proxy.rmi.gumball.GumballMachineRemote.class.getMethod("getCount", new java.lang.Class[] {});
	    $method_getLocation_1 = proxy.rmi.gumball.GumballMachineRemote.class.getMethod("getLocation", new java.lang.Class[] {});
	    $method_getState_2 = proxy.rmi.gumball.GumballMachineRemote.class.getMethod("getState", new java.lang.Class[] {});
	} catch (java.lang.NoSuchMethodException e) {
	    throw new java.lang.NoSuchMethodError(
		"stub class initialization failed");
	}
    }
    
    // constructors
    public GumballMachine_Stub(java.rmi.server.RemoteRef ref) {
	super(ref);
    }
    
    // methods from remote interfaces
    
    // implementation of getCount()
    public int getCount()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getCount_0, null, 5415021927044575777L);
	    return ((java.lang.Integer) $result).intValue();
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getLocation()
    public java.lang.String getLocation()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getLocation_1, null, 2587264140709372528L);
	    return ((java.lang.String) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
    
    // implementation of getState()
    public proxy.rmi.gumball.states.State getState()
	throws java.rmi.RemoteException
    {
	try {
	    Object $result = ref.invoke(this, $method_getState_2, null, 4010694504065170636L);
	    return ((proxy.rmi.gumball.states.State) $result);
	} catch (java.lang.RuntimeException e) {
	    throw e;
	} catch (java.rmi.RemoteException e) {
	    throw e;
	} catch (java.lang.Exception e) {
	    throw new java.rmi.UnexpectedException("undeclared checked exception", e);
	}
    }
}