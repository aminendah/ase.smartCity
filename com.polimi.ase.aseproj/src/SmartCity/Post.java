/**
 */
package SmartCity;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link SmartCity.Post#getVideos <em>Videos</em>}</li>
 *   <li>{@link SmartCity.Post#getImages <em>Images</em>}</li>
 *   <li>{@link SmartCity.Post#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @see SmartCity.SmartCityPackage#getPost()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='imageAndVideoLimitations validImages validVideos'"
 *        annotation="http://www.eclipse.org/emf/2002/Ecore/OCL/Pivot imageAndVideoLimitations='(\n\t\t\tself.oclIsTypeOf(Facebook) or\n\t\t\tself.oclIsTypeOf(Twitter) or \n\t\t\tself.oclIsTypeOf(Instagram) \n\t\t\tand (\n\t\t\t\tself.images -> size() > 0 \n\t\t\t\tor self.videos -> size() > 0\n\t\t\t)\n\t\t) implies (\n\t\t\tself.images -> size() = 0 and self.videos -> size() = 1\n\t\t) or (self.images -> size() = 1 and self.videos -> size() = 0)' validImages='(self.images -> select(i | i.oclIsTypeOf(Image)) -> size()) = (self.images -> size())' validVideos='(self.videos -> select(v | v.oclIsTypeOf(WebVideo)) -> size()) = (self.videos -> size())'"
 * @generated
 */
public interface Post extends Text, Image, Video, Data {
	/**
	 * Returns the value of the '<em><b>Videos</b></em>' containment reference list.
	 * The list contents are of type {@link SmartCity.WebVideo}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Videos</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Videos</em>' containment reference list.
	 * @see SmartCity.SmartCityPackage#getPost_Videos()
	 * @model type="SmartCity.WebVideo" containment="true"
	 * @generated
	 */
	EList getVideos();

	/**
	 * Returns the value of the '<em><b>Images</b></em>' containment reference list.
	 * The list contents are of type {@link SmartCity.Image}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Images</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Images</em>' containment reference list.
	 * @see SmartCity.SmartCityPackage#getPost_Images()
	 * @model type="SmartCity.Image" containment="true"
	 * @generated
	 */
	EList getImages();

	/**
	 * Returns the value of the '<em><b>Paragraphs</b></em>' containment reference list.
	 * The list contents are of type {@link SmartCity.Paragraph}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Paragraphs</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Paragraphs</em>' containment reference list.
	 * @see SmartCity.SmartCityPackage#getPost_Paragraphs()
	 * @model type="SmartCity.Paragraph" containment="true"
	 * @generated
	 */
	EList getParagraphs();

} // Post
