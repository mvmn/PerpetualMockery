/**
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.dsl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link x.mvmn.permock.dsl.dsl.Rule#getConditions <em>Conditions</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.Rule#getProxy <em>Proxy</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.Rule#getResponse <em>Response</em>}</li>
 * </ul>
 *
 * @see x.mvmn.permock.dsl.dsl.DslPackage#getRule()
 * @model
 * @generated
 */
public interface Rule extends EObject
{
  /**
   * Returns the value of the '<em><b>Conditions</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Conditions</em>' containment reference.
   * @see #setConditions(Condition)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getRule_Conditions()
   * @model containment="true"
   * @generated
   */
  Condition getConditions();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.Rule#getConditions <em>Conditions</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Conditions</em>' containment reference.
   * @see #getConditions()
   * @generated
   */
  void setConditions(Condition value);

  /**
   * Returns the value of the '<em><b>Proxy</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Proxy</em>' containment reference.
   * @see #setProxy(ProxyConf)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getRule_Proxy()
   * @model containment="true"
   * @generated
   */
  ProxyConf getProxy();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.Rule#getProxy <em>Proxy</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Proxy</em>' containment reference.
   * @see #getProxy()
   * @generated
   */
  void setProxy(ProxyConf value);

  /**
   * Returns the value of the '<em><b>Response</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the value of the '<em>Response</em>' containment reference.
   * @see #setResponse(ResponseConf)
   * @see x.mvmn.permock.dsl.dsl.DslPackage#getRule_Response()
   * @model containment="true"
   * @generated
   */
  ResponseConf getResponse();

  /**
   * Sets the value of the '{@link x.mvmn.permock.dsl.dsl.Rule#getResponse <em>Response</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Response</em>' containment reference.
   * @see #getResponse()
   * @generated
   */
  void setResponse(ResponseConf value);

} // Rule
