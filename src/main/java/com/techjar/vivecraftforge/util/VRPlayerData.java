package com.techjar.vivecraftforge.util;

import com.mojang.math.Vector3d;

public class VRPlayerData {
	public Vector3d offset = new Vector3d(0, 0, 0);
	public ObjectInfo head = new ObjectInfo();
	public ObjectInfo controller0 = new ObjectInfo();
	public ObjectInfo controller1 = new ObjectInfo();
	public boolean handsReversed;
	public float worldScale;
	public boolean seated;
	public boolean freeMove;
	public float bowDraw;
	public float height;
	public int activeHand;
	public boolean crawling;

	public ObjectInfo getController(int c) {
		return c == 0 ? controller0 : controller1;
	}

	public static class ObjectInfo {
		public double posX;
		public double posY;
		public double posZ;
		public float rotW;
		public float rotX;
		public float rotY;
		public float rotZ;

		public Vector3d getPos() {
			return new Vector3d(posX, posY, posZ);
		}

		public void setPos(Vector3d pos) {
			posX = pos.x;
			posY = pos.y;
			posZ = pos.z;
		}

		public Quaternion getRot() {
			return new Quaternion(rotW, rotX, rotY, rotZ);
		}

		public void setRot(Quaternion quat) {
			rotW = quat.w;
			rotX = quat.x;
			rotY = quat.y;
			rotZ = quat.z;
		}
	}
}
