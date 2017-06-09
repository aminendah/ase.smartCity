/**
 */
package SmartCity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Smart City</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SmartCity.SmartCity#getProviders <em>Providers</em>}</li>
 * </ul>
 *
 * @see SmartCity.SmartCityPackage#getSmartCity()
 * @model
 * @generated
 */
public interface SmartCity extends EObject {
	/**
	 * Returns the value of the '<em><b>Providers</b></em>' containment reference list.
	 * The list contents are of type {@link SmartCity.Provider}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Providers</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Providers</em>' containment reference list.
	 * @see SmartCity.SmartCityPackage#getSmartCity_Providers()
	 * @model type="SmartCity.Provider" containment="true"
	 * @generated
	 */
	EList getProviders();

} // SmartCity
