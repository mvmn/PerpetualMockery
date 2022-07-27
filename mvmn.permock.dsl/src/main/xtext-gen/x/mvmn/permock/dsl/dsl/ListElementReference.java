/**
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>List Element Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link x.mvmn.permock.dsl.dsl.ListElementReference#getName <em>Name</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.ListElementReference#getProp <em>Prop</em>}</li>
 * </ul>
 *
 * @see x.mvmn.permock.dsl.dsl.DslPackage#getListElementReference()
 * @model
 * @generated
 */
public interface ListElementReference extends EObject
{
  /**
   * Returns the value of the '<em><b>Name</b></em>' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Name</em>' reference.
   * @see #setName(ListElementAlias)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getListElementReference_Name()
   * @model
   * @generated
   */
  ListElementAlias getName();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.ListElementReference#getName <em>Name</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Name</em>' reference.
   * @see #getName()
   * @generated
   */
  void setName(ListElementAlias value);

  /**
   * Returns the value of the '<em><b>Prop</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Prop</em>' containment reference.
   * @see #setProp(PropertyRef)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getListElementReference_Prop()
   * @model containment="true"
   * @generated
   */
  PropertyRef getProp();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.ListElementReference#getProp <em>Prop</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Prop</em>' containment reference.
   * @see #getProp()
   * @generated
   */
  void setProp(PropertyRef value);

} // ListElementReference