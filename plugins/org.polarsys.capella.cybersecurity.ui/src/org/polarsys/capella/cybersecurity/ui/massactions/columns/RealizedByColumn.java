package org.polarsys.capella.cybersecurity.ui.massactions.columns;

import org.eclipse.emf.ecore.EObject;
import org.polarsys.capella.cybersecurity.model.FunctionalPrimaryAsset;
import org.polarsys.capella.cybersecurity.model.InformationPrimaryAsset;
import org.polarsys.capella.cybersecurity.ui.massactions.Messages;

public class RealizedByColumn extends AbstractCybersecurityColumn {
  public RealizedByColumn() {
    id = getClass().getCanonicalName();
    label = Messages.PrimaryAssetColumns_Label_RealizedBy;
    name = Messages.PrimaryAssetColumns_Name_RealizedBy;
  }

  @Override
  public Object getDataValue(EObject rowObject) {
    if (rowObject instanceof InformationPrimaryAsset) {
      return (((InformationPrimaryAsset) rowObject).getExchangeItems());
    }
    if (rowObject instanceof FunctionalPrimaryAsset) {
      return (((FunctionalPrimaryAsset) rowObject).getFunctions());
    }
    return null;
  }
}