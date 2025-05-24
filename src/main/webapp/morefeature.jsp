<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
.more-features {
  background: #f7f7f7;
  padding: 60px 20px;
  text-align: center;
  font-family: 'Segoe UI', sans-serif;
}

.section-title {
  font-size: 36px;
  color: #333;
  margin-bottom: 10px;
}

.section-subtitle {
  font-size: 18px;
  color: #777;
  margin-bottom: 40px;
}

.features-grid {
  display: grid;
  grid-template-columns: repeat(auto-fit, minmax(250px, 1fr));
  gap: 30px;
  max-width: 1000px;
  margin: 0 auto;
}

.feature-card {
  background: #fff;
  padding: 25px;
  border-radius: 12px;
  box-shadow: 0 6px 15px rgba(0, 0, 0, 0.1);
  transition: transform 0.3s ease, box-shadow 0.3s ease;
}

.feature-card:hover {
  transform: translateY(-5px);
  box-shadow: 0 12px 20px rgba(0, 0, 0, 0.15);
}

.feature-card h3 {
  font-size: 20px;
  color: #2c3e50;
  margin-bottom: 10px;
}

.feature-card p {
  font-size: 15px;
  color: #555;
}

</style>
</head>
<body>

<section class="more-features">
  <h2 class="section-title">More Features</h2>
  <p class="section-subtitle">Explore powerful features designed to keep you safe and informed.</p>

  <div class="features-grid">
    <div class="feature-card">
      <h3>🚨 Emergency Alert</h3>
      <p>Send a quick alert with your location to trusted contacts in one click.</p>
    </div>

    <div class="feature-card">
      <h3>📍 Live Location Sharing</h3>
      <p>Share your real-time location with family and friends instantly.</p>
    </div>

    <div class="feature-card">
      <h3>📞 24/7 Helpline Access</h3>
      <p>Connect with women’s safety helplines anytime you need help.</p>
    </div>

    <div class="feature-card">
      <h3>📄 Safety Tips & Resources</h3>
      <p>Read verified safety tips and download helpful guides and contacts.</p>
    </div>

    <div class="feature-card">
      <h3>📝 Report an Incident</h3>
      <p>Submit reports anonymously to raise awareness and alert authorities.</p>
    </div>

    <div class="feature-card">
      <h3>🔒 Privacy Protection</h3>
      <p>Your data and location are always kept safe and confidential.</p>
    </div>
  </div>
</section>

</body>
</html>