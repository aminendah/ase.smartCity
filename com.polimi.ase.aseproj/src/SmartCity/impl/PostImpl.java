/**
 */
package SmartCity.impl;

import SmartCity.Image;
import SmartCity.Paragraph;
import SmartCity.Post;
import SmartCity.SmartCityPackage;
import SmartCity.WebVideo;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Post</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link SmartCity.impl.PostImpl#getVideos <em>Videos</em>}</li>
 *   <li>{@link SmartCity.impl.PostImpl#getImages <em>Images</em>}</li>
 *   <li>{@link SmartCity.impl.PostImpl#getParagraphs <em>Paragraphs</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PostImpl extends TextImpl implements Post {
	/**
	 * The cached value of the '{@link #getVideos() <em>Videos</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVideos()
	 * @generated
	 * @ordered
	 */
	protected EList videos;

	/**
	 * The cached value of the '{@link #getImages() <em>Images</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImages()
	 * @generated
	 * @ordered
	 */
	protected EList images;

	/**
	 * The cached value of the '{@link #getParagraphs() <em>Paragraphs</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParagraphs()
	 * @generated
	 * @ordered
	 */
	protected EList paragraphs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PostImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EClass eStaticClass() {
		return SmartCityPackage.Literals.POST;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getVideos() {
		if (videos == null) {
			videos = new EObjectContainmentEList(WebVideo.class, this, SmartCityPackage.POST__VIDEOS);
		}
		return videos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getImages() {
		if (images == null) {
			images = new EObjectContainmentEList(Image.class, this, SmartCityPackage.POST__IMAGES);
		}
		return images;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList getParagraphs() {
		if (paragraphs == null) {
			paragraphs = new EObjectContainmentEList(Paragraph.class, this, SmartCityPackage.POST__PARAGRAPHS);
		}
		return paragraphs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SmartCityPackage.POST__VIDEOS:
				return ((InternalEList)getVideos()).basicRemove(otherEnd, msgs);
			case SmartCityPackage.POST__IMAGES:
				return ((InternalEList)getImages()).basicRemove(otherEnd, msgs);
			case SmartCityPackage.POST__PARAGRAPHS:
				return ((InternalEList)getParagraphs()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SmartCityPackage.POST__VIDEOS:
				return getVideos();
			case SmartCityPackage.POST__IMAGES:
				return getImages();
			case SmartCityPackage.POST__PARAGRAPHS:
				return getParagraphs();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SmartCityPackage.POST__VIDEOS:
				getVideos().clear();
				getVideos().addAll((Collection)newValue);
				return;
			case SmartCityPackage.POST__IMAGES:
				getImages().clear();
				getImages().addAll((Collection)newValue);
				return;
			case SmartCityPackage.POST__PARAGRAPHS:
				getParagraphs().clear();
				getParagraphs().addAll((Collection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void eUnset(int featureID) {
		switch (featureID) {
			case SmartCityPackage.POST__VIDEOS:
				getVideos().clear();
				return;
			case SmartCityPackage.POST__IMAGES:
				getImages().clear();
				return;
			case SmartCityPackage.POST__PARAGRAPHS:
				getParagraphs().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SmartCityPackage.POST__VIDEOS:
				return videos != null && !videos.isEmpty();
			case SmartCityPackage.POST__IMAGES:
				return images != null && !images.isEmpty();
			case SmartCityPackage.POST__PARAGRAPHS:
				return paragraphs != null && !paragraphs.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //PostImpl
