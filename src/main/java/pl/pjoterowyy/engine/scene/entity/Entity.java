package pl.pjoterowyy.engine.scene.entity;

import pl.pjoterowyy.engine.render.Renderer;
import pl.pjoterowyy.engine.scene.mesh.Model;
import org.joml.Matrix4f;

public class Entity
{
    private Model model;
    private Transform transform;

    public Entity(Model model, Transform transform)
    {
        this.model = model;
        this.transform = transform;
    }

    public void render(Matrix4f camera, Matrix4f projection)
    {
        Renderer.render(this, camera, projection);
    }

    public Model getModel()
    {
        return model;
    }

    public Transform getTransform()
    {
        return transform;
    }
}
