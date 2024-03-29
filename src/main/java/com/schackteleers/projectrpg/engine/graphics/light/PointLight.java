package com.schackteleers.projectrpg.engine.graphics.light;

import org.joml.Vector3f;

/**
 * @author Stijn Schack
 * @since 5/10/2017
 */
public class PointLight {

    private Vector3f color;

    private Vector3f position;

    private float intensity;

    private Attenuation attenuation;

    public PointLight(Vector3f color, Vector3f position, float intensity) {
        attenuation = new Attenuation(0, 0.3f, 0);
        this.color = color;
        this.position = position;
        this.intensity = intensity;
    }

    public PointLight(Vector3f color, Vector3f position, float intensity, Attenuation attenuation) {
        this(color, position, intensity);
        this.attenuation = attenuation;
    }

    public PointLight(PointLight pointLight) {
        this(new Vector3f(pointLight.getColor()), new Vector3f(pointLight.getPosition()),
                pointLight.getIntensity(), pointLight.getAttenuation());
    }

    public Vector3f getColor() {
        return color;
    }

    public void setColor(Vector3f color) {
        this.color = color;
    }

    public Vector3f getPosition() {
        return position;
    }

    public void setPosition(Vector3f position) {
        this.position = position;
    }

    public float getIntensity() {
        return intensity;
    }

    public void setIntensity(float intensity) {
        this.intensity = intensity;
    }

    public Attenuation getAttenuation() {
        return attenuation;
    }

    public PointLight setAttenuation(Attenuation attenuation) {
        this.attenuation = attenuation;
        return this;
    }

    public PointLight setAttenuation(float constant, float linear, float exponent) {
        this.attenuation.constant = constant;
        this.attenuation.linear = linear;
        this.attenuation.exponent = exponent;
        return this;
    }

    public static class Attenuation {

        private float constant;

        private float linear;

        private float exponent;

        Attenuation(float constant, float linear, float exponent) {
            this.constant = constant;
            this.linear = linear;
            this.exponent = exponent;
        }

        public float getConstant() {
            return constant;
        }

        public void setConstant(float constant) {
            this.constant = constant;
        }

        public float getLinear() {
            return linear;
        }

        public void setLinear(float linear) {
            this.linear = linear;
        }

        public float getExponent() {
            return exponent;
        }

        public void setExponent(float exponent) {
            this.exponent = exponent;
        }
    }
}
