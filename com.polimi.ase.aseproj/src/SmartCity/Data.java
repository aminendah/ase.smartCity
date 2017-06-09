/**
 */
package SmartCity;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SmartCity.Data#getMetadataInfo <em>Metadata Info</em>}</li>
 * </ul>
 *
 * @see SmartCity.SmartCityPackage#getData()
 * @model
 * @generated
 */
public interface Data extends EObject {
	/**
	 * Returns the value of the '<em><b>Metadata Info</b></em>' containment reference list.
	 * The list contents are of type {@link SmartCity.Metadata}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metadata Info</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metadata Info</em>' containment reference list.
	 * @see SmartCity.SmartCityPackage#getData_MetadataInfo()
	 * @model type="SmartCity.Metadata" containment="true"
	 * @generated
	 */
	EList getMetadataInfo();

} // Data
