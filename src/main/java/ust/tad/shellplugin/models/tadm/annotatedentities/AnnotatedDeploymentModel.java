package ust.tad.shellplugin.models.tadm.annotatedentities;

import java.util.List;
import java.util.Objects;
import java.util.UUID;

import ust.tad.shellplugin.models.tadm.entities.Component;
import ust.tad.shellplugin.models.tadm.entities.ComponentType;
import ust.tad.shellplugin.models.tadm.entities.DeploymentModel;
import ust.tad.shellplugin.models.tadm.entities.Property;
import ust.tad.shellplugin.models.tadm.entities.Relation;
import ust.tad.shellplugin.models.tadm.entities.RelationType;

public class AnnotatedDeploymentModel extends DeploymentModel{

    private UUID transformationProcessId;
    

    public AnnotatedDeploymentModel() {
        super();
    }

    public AnnotatedDeploymentModel(List<Property> properties, List<Component> components, List<Relation> relations, List<ComponentType> componentTypes, List<RelationType> relationTypes, UUID transformationProcessId) {
        super(properties, components, relations, componentTypes, relationTypes);
        this.transformationProcessId = transformationProcessId;
    }

    public UUID getTransformationProcessId() {
        return this.transformationProcessId;
    }

    public void setTransformationProcessId(UUID transformationProcessId) {
        this.transformationProcessId = transformationProcessId;
    }

    public AnnotatedDeploymentModel transformationProcessId(UUID transformationProcessId) {
        setTransformationProcessId(transformationProcessId);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof AnnotatedDeploymentModel)) {
            return false;
        }
        AnnotatedDeploymentModel annotatedDeploymentModel = (AnnotatedDeploymentModel) o;
        return Objects.equals(getProperties(), annotatedDeploymentModel.getProperties()) 
            && Objects.equals(getComponents(), annotatedDeploymentModel.getComponents()) 
            && Objects.equals(getRelations(), annotatedDeploymentModel.getRelations()) 
            && Objects.equals(getComponentTypes(), annotatedDeploymentModel.getComponentTypes()) 
            && Objects.equals(getRelationTypes(), annotatedDeploymentModel.getRelationTypes())
            && Objects.equals(transformationProcessId, annotatedDeploymentModel.transformationProcessId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getProperties(), getComponents(), getRelations(), getComponentTypes(), getRelationTypes(), transformationProcessId);
    }

    @Override
    public String toString() {
        return "{" +
            " properties='" + getProperties() + "'" +
            ", components='" + getComponents() + "'" +
            ", relations='" + getRelations() + "'" +
            ", componentTypes='" + getComponentTypes() + "'" +
            ", relationTypes='" + getRelationTypes() + "'" +
            ", transformationProcessId='" + getTransformationProcessId() + "'" +
            "}";
    }

}
