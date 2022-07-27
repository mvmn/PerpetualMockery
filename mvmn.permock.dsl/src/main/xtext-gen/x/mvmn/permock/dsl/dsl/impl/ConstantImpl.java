/**
 * generated by Xtext 2.25.0
 */
package x.mvmn.permock.dsl.dsl.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import x.mvmn.permock.dsl.dsl.Constant;
import x.mvmn.permock.dsl.dsl.DslPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constant</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link x.mvmn.permock.dsl.dsl.impl.ConstantImpl#getStrVal <em>Str Val</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.impl.ConstantImpl#getIntVal <em>Int Val</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.impl.ConstantImpl#getFloatVal <em>Float Val</em>}</li>
 *   <li>{@link x.mvmn.permock.dsl.dsl.impl.ConstantImpl#getBoolVal <em>Bool Val</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ConstantImpl extends MinimalEObjectImpl.Container implements Constant
{
  /**
   * The default value of the '{@link #getStrVal() <em>Str Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrVal()
   * @generated
   * @ordered
   */
  protected static final String STR_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getStrVal() <em>Str Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStrVal()
   * @generated
   * @ordered
   */
  protected String strVal = STR_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntVal()
   * @generated
   * @ordered
   */
  protected static final Long INT_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getIntVal() <em>Int Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getIntVal()
   * @generated
   * @ordered
   */
  protected Long intVal = INT_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getFloatVal() <em>Float Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatVal()
   * @generated
   * @ordered
   */
  protected static final Double FLOAT_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getFloatVal() <em>Float Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getFloatVal()
   * @generated
   * @ordered
   */
  protected Double floatVal = FLOAT_VAL_EDEFAULT;

  /**
   * The default value of the '{@link #getBoolVal() <em>Bool Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolVal()
   * @generated
   * @ordered
   */
  protected static final Boolean BOOL_VAL_EDEFAULT = null;

  /**
   * The cached value of the '{@link #getBoolVal() <em>Bool Val</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getBoolVal()
   * @generated
   * @ordered
   */
  protected Boolean boolVal = BOOL_VAL_EDEFAULT;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected ConstantImpl()
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
    return DslPackage.Literals.CONSTANT;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public String getStrVal()
  {
    return strVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setStrVal(String newStrVal)
  {
    String oldStrVal = strVal;
    strVal = newStrVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONSTANT__STR_VAL, oldStrVal, strVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Long getIntVal()
  {
    return intVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setIntVal(Long newIntVal)
  {
    Long oldIntVal = intVal;
    intVal = newIntVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONSTANT__INT_VAL, oldIntVal, intVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Double getFloatVal()
  {
    return floatVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setFloatVal(Double newFloatVal)
  {
    Double oldFloatVal = floatVal;
    floatVal = newFloatVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONSTANT__FLOAT_VAL, oldFloatVal, floatVal));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Boolean getBoolVal()
  {
    return boolVal;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void setBoolVal(Boolean newBoolVal)
  {
    Boolean oldBoolVal = boolVal;
    boolVal = newBoolVal;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, DslPackage.CONSTANT__BOOL_VAL, oldBoolVal, boolVal));
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
      case DslPackage.CONSTANT__STR_VAL:
        return getStrVal();
      case DslPackage.CONSTANT__INT_VAL:
        return getIntVal();
      case DslPackage.CONSTANT__FLOAT_VAL:
        return getFloatVal();
      case DslPackage.CONSTANT__BOOL_VAL:
        return getBoolVal();
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
      case DslPackage.CONSTANT__STR_VAL:
        setStrVal((String)newValue);
        return;
      case DslPackage.CONSTANT__INT_VAL:
        setIntVal((Long)newValue);
        return;
      case DslPackage.CONSTANT__FLOAT_VAL:
        setFloatVal((Double)newValue);
        return;
      case DslPackage.CONSTANT__BOOL_VAL:
        setBoolVal((Boolean)newValue);
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
      case DslPackage.CONSTANT__STR_VAL:
        setStrVal(STR_VAL_EDEFAULT);
        return;
      case DslPackage.CONSTANT__INT_VAL:
        setIntVal(INT_VAL_EDEFAULT);
        return;
      case DslPackage.CONSTANT__FLOAT_VAL:
        setFloatVal(FLOAT_VAL_EDEFAULT);
        return;
      case DslPackage.CONSTANT__BOOL_VAL:
        setBoolVal(BOOL_VAL_EDEFAULT);
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
      case DslPackage.CONSTANT__STR_VAL:
        return STR_VAL_EDEFAULT == null ? strVal != null : !STR_VAL_EDEFAULT.equals(strVal);
      case DslPackage.CONSTANT__INT_VAL:
        return INT_VAL_EDEFAULT == null ? intVal != null : !INT_VAL_EDEFAULT.equals(intVal);
      case DslPackage.CONSTANT__FLOAT_VAL:
        return FLOAT_VAL_EDEFAULT == null ? floatVal != null : !FLOAT_VAL_EDEFAULT.equals(floatVal);
      case DslPackage.CONSTANT__BOOL_VAL:
        return BOOL_VAL_EDEFAULT == null ? boolVal != null : !BOOL_VAL_EDEFAULT.equals(boolVal);
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
    result.append(" (strVal: ");
    result.append(strVal);
    result.append(", intVal: ");
    result.append(intVal);
    result.append(", floatVal: ");
    result.append(floatVal);
    result.append(", boolVal: ");
    result.append(boolVal);
    result.append(')');
    return result.toString();
  }

} //ConstantImpl
