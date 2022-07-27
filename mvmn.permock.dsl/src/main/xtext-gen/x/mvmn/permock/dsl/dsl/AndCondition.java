/**
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.dsl;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>And Condition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link x.mvmn.permock.dsl.dsl.AndCondition#getLeft <em>Left</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.AndCondition#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see x.mvmn.permock.dsl.dsl.DslPackage#getAndCondition()
 * @model
 * @generated
 */
public interface AndCondition extends Condition
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Condition)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getAndCondition_Left()
   * @model containment="true"
   * @generated
   */
  Condition getLeft();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.AndCondition#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Condition value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Condition)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getAndCondition_Right()
   * @model containment="true"
   * @generated
   */
  Condition getRight();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.AndCondition#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Condition value);

} // AndCondition
