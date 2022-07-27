/**
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link x.mvmn.permock.dsl.dsl.Expression#getLeft <em>Left</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.Expression#getOp <em>Op</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.Expression#getRight <em>Right</em>}</li>
 * </ul>
 *
 * @see x.mvmn.permock.dsl.dsl.DslPackage#getExpression()
 * @model
 * @generated
 */
public interface Expression extends EObject
{
  /**
   * Returns the value of the '<em><b>Left</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Left</em>' containment reference.
   * @see #setLeft(Operand)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getExpression_Left()
   * @model containment="true"
   * @generated
   */
  Operand getLeft();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.Expression#getLeft <em>Left</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Left</em>' containment reference.
   * @see #getLeft()
   * @generated
   */
  void setLeft(Operand value);

  /**
   * Returns the value of the '<em><b>Op</b></em>' attribute.
   * The literals are from the enumeration {@link x.mvmn.permock.dsl.dsl.Operator}.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Op</em>' attribute.
   * @see x.mvmn.permock.dsl.dsl.Operator
   * @see #setOp(Operator)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getExpression_Op()
   * @model
   * @generated
   */
  Operator getOp();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.Expression#getOp <em>Op</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Op</em>' attribute.
   * @see x.mvmn.permock.dsl.dsl.Operator
   * @see #getOp()
   * @generated
   */
  void setOp(Operator value);

  /**
   * Returns the value of the '<em><b>Right</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Right</em>' containment reference.
   * @see #setRight(Operand)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getExpression_Right()
   * @model containment="true"
   * @generated
   */
  Operand getRight();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.Expression#getRight <em>Right</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Right</em>' containment reference.
   * @see #getRight()
   * @generated
   */
  void setRight(Operand value);

} // Expression
