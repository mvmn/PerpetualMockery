/**
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import x.mvmn.permock.dsl.dsl.DslPackage;
import x.mvmn.permock.dsl.dsl.ProxyConf;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Proxy Conf</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link x.mvmn.permock.dsl.dsl.impl.ProxyConfImpl#getProxyUrl <em>Proxy Url</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProxyConfImpl extends MinimalEObjectImpl.Container implements ProxyConf
{
  /**
   * The default value of the '{@link #getProxyUrl() <em>Proxy Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxyUrl()
   * @generated
   * @ordered
   */
  protected static final String PROXY_URL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getProxyUrl() <em>Proxy Url</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getProxyUrl()
   * @generated
   * @ordered
   */
  protected String proxyUrl = PROXY_URL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ProxyConfImpl()
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
    return DslPackage.Literals.PROXY_CONF;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getProxyUrl()
  {
    return proxyUrl;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setProxyUrl(String newProxyUrl)
  {
    String oldProxyUrl = proxyUrl;
    proxyUrl = newProxyUrl;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.PROXY_CONF__PROXY_URL, oldProxyUrl, proxyUrl));
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
      case DslPackage.PROXY_CONF__PROXY_URL:
        return getProxyUrl();
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
      case DslPackage.PROXY_CONF__PROXY_URL:
        setProxyUrl((String)newValue);
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
      case DslPackage.PROXY_CONF__PROXY_URL:
        setProxyUrl(PROXY_URL_EDEFAULT);
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
      case DslPackage.PROXY_CONF__PROXY_URL:
        return PROXY_URL_EDEFAULT == null ? proxyUrl != null : !PROXY_URL_EDEFAULT.equals(proxyUrl);
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
    result.append(" (proxyUrl: ");
    result.append(proxyUrl);
    result.append(')');
    return result.toString();
  }

} //ProxyConfImpl