/**
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Access</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link x.mvmn.permock.dsl.dsl.CollectionAccess#getKey <em>Key</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.CollectionAccess#getIndex <em>Index</em>}</li>
 * </ul>
 *
 * @see x.mvmn.permock.dsl.dsl.DslPackage#getCollectionAccess()
 * @model
 * @generated
 */
public interface CollectionAccess extends EObject
{
  /**
   * Returns the value of the '<em><b>Key</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Key</em>' attribute.
   * @see #setKey(String)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getCollectionAccess_Key()
   * @model
   * @generated
   */
  String getKey();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.CollectionAccess#getKey <em>Key</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Key</em>' attribute.
   * @see #getKey()
   * @generated
   */
  void setKey(String value);

  /**
   * Returns the value of the '<em><b>Index</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Index</em>' attribute.
   * @see #setIndex(Long)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getCollectionAccess_Index()
   * @model
   * @generated
   */
  Long getIndex();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.CollectionAccess#getIndex <em>Index</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Index</em>' attribute.
   * @see #getIndex()
   * @generated
   */
  void setIndex(Long value);

} // CollectionAccess
