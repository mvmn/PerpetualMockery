/**
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import x.mvmn.permock.dsl.dsl.DslPackage;
import x.mvmn.permock.dsl.dsl.Headers;
import x.mvmn.permock.dsl.dsl.ResponseConf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link x.mvmn.permock.dsl.dsl.impl.ResponseConfImpl#getHttpStatus <em>Http Status</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.impl.ResponseConfImpl#getContent <em>Content</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.impl.ResponseConfImpl#getHeaders <em>Headers</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResponseConfImpl extends MinimalEObjectImpl.Container implements ResponseConf
{
  /**
   * The default value of the '{@link #getHttpStatus() <em>Http Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttpStatus()
   * @generated
   * @ordered
   */
  protected static final Long HTTP_STATUS_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getHttpStatus() <em>Http Status</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHttpStatus()
   * @generated
   * @ordered
   */
  protected Long httpStatus = HTTP_STATUS_EDEFAULT;

  /**
   * The default value of the '{@link #getContent() <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected static final String CONTENT_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getContent() <em>Content</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getContent()
   * @generated
   * @ordered
   */
  protected String content = CONTENT_EDEFAULT;

  /**
   * The cached value of the '{@link #getHeaders() <em>Headers</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getHeaders()
   * @generated
   * @ordered
   */
  protected Headers headers;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ResponseConfImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return DslPackage.Literals.RESPONSE_CONF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Long getHttpStatus()
  {
    return httpStatus;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHttpStatus(Long newHttpStatus)
  {
    Long oldHttpStatus = httpStatus;
    httpStatus = newHttpStatus;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.RESPONSE_CONF__HTTP_STATUS, oldHttpStatus, httpStatus));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getContent()
  {
    return content;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setContent(String newContent)
  {
    String oldContent = content;
    content = newContent;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.RESPONSE_CONF__CONTENT, oldContent, content));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Headers getHeaders()
  {
    return headers;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NotificationChain basicSetHeaders(Headers newHeaders, NotificationChain msgs)
  {
    Headers oldHeaders = headers;
    headers = newHeaders;
    if (eNotificationRequired())
    {
      ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, DslPackage.RESPONSE_CONF__HEADERS, oldHeaders, newHeaders);
      if (msgs == null) msgs = notification; else msgs.add(notification);
    }
    return msgs;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setHeaders(Headers newHeaders)
  {
    if (newHeaders != headers)
    {
      NotificationChain msgs = null;
      if (headers != null)
        msgs = ((InternalEObject)headers).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - DslPackage.RESPONSE_CONF__HEADERS, null, msgs);
      if (newHeaders != null)
        msgs = ((InternalEObject)newHeaders).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - DslPackage.RESPONSE_CONF__HEADERS, null, msgs);
      msgs = basicSetHeaders(newHeaders, msgs);
      if (msgs != null) msgs.dispatch();
    }
    else if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.RESPONSE_CONF__HEADERS, newHeaders, newHeaders));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs)
  {
    switch (featureID)
    {
      case DslPackage.RESPONSE_CONF__HEADERS:
        return basicSetHeaders(null, msgs);
    }
    return super.eInverseRemove(otherEnd, featureID, msgs);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case DslPackage.RESPONSE_CONF__HTTP_STATUS:
        return getHttpStatus();
      case DslPackage.RESPONSE_CONF__CONTENT:
        return getContent();
      case DslPackage.RESPONSE_CONF__HEADERS:
        return getHeaders();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case DslPackage.RESPONSE_CONF__HTTP_STATUS:
        setHttpStatus((Long)newValue);
        return;
      case DslPackage.RESPONSE_CONF__CONTENT:
        setContent((String)newValue);
        return;
      case DslPackage.RESPONSE_CONF__HEADERS:
        setHeaders((Headers)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.RESPONSE_CONF__HTTP_STATUS:
        setHttpStatus(HTTP_STATUS_EDEFAULT);
        return;
      case DslPackage.RESPONSE_CONF__CONTENT:
        setContent(CONTENT_EDEFAULT);
        return;
      case DslPackage.RESPONSE_CONF__HEADERS:
        setHeaders((Headers)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case DslPackage.RESPONSE_CONF__HTTP_STATUS:
        return HTTP_STATUS_EDEFAULT == null ? httpStatus != null : !HTTP_STATUS_EDEFAULT.equals(httpStatus);
      case DslPackage.RESPONSE_CONF__CONTENT:
        return CONTENT_EDEFAULT == null ? content != null : !CONTENT_EDEFAULT.equals(content);
      case DslPackage.RESPONSE_CONF__HEADERS:
        return headers != null;
    }
    return super.eIsSet(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String toString()
  {
    if (eIsProxy()) return super.toString();

    StringBuilder result = new StringBuilder(super.toString());
    result.append(" (httpStatus: ");
    result.append(httpStatus);
    result.append(", content: ");
    result.append(content);
    result.append(')');
    return result.toString();
  }

} //ResponseConfImpl